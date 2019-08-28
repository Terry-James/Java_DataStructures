package queueExamples;

public class ArrayUnboundedQueue<T> implements QueueInterface<T> {
	private final int capacity = 50;
	private T[] array;
	private int orginialCapacity;
	private int numberOfElements = 0;
	private int head = 0;
	private int tail;
	
	@SuppressWarnings("unchecked")
	ArrayUnboundedQueue(){
		array = (T[]) new Object[capacity];
		tail = array.length - 1;
		orginialCapacity = capacity;
	}
	
	@SuppressWarnings("unchecked")
	ArrayUnboundedQueue(int size){
		array = (T[]) new Object[size];
		tail = array.length - 1;
		orginialCapacity = size;
	}
	
	private void increaseSize() {
		int currentSize = array.length;
		int newSize = currentSize + orginialCapacity; 
		@SuppressWarnings("unchecked")
		T [] newArray = (T[]) new Object[newSize];
		int currentHead = head;
		
		for(int i = 0; i < numberOfElements; i++) {
			newArray[i] = array[i];
			currentHead = (currentHead + 1) % currentSize;
		}
		array = newArray;
		head = 0;
		tail = numberOfElements - 1;
	}

	@Override
	public void enqueue(T input){
		if(isFull()) {
			increaseSize();	
		}
		tail = (tail + 1) % array.length;
		array[tail] = input;
		numberOfElements++;
	}

	
	public T dequeue() throws QueueUnderflowException {
		if(isEmpty()) {
			throw new QueueUnderflowException("Invalid: Trying to dequeue from an empty queue.");
		}
		else {
			T result = array[head];
			head = (head + 1) % array.length;
			numberOfElements--;
			return result;
		}
	}

	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		return (numberOfElements == 0);
	}

	@Override
	public boolean isFull() {
		return (numberOfElements == array.length);
	}
	
}

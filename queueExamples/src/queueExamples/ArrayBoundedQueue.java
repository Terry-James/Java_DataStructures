package queueExamples;

public class ArrayBoundedQueue<T> implements QueueInterface<T> {
	private final int capacity = 50;
	private T[] array;
	private int numberOfElements = 0;
	private int head = 0;
	private int tail;
	
	@SuppressWarnings("unchecked")
	public ArrayBoundedQueue(){	
		array = (T[]) new Object[capacity];
		tail = capacity - 1;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayBoundedQueue(int size) {
		array = (T[]) new Object[size];
		tail = size - 1;
	}
	
	public void enqueue(T input) throws QueueOverflowException {
		if(isFull()) {
			throw new QueueOverflowException("Invalid: Queue is full perform dequeue first.");
		}
		else {
			tail = (tail + 1) % array.length;
			array[tail] = input;
			numberOfElements++;
		}
	}

	public T dequeue() throws QueueUnderflowException {
		if(isEmpty()) {
			throw new QueueUnderflowException("Invalid: Trying to depueue an empty queue.");
		}
		else {
			T result = array[head];
			array[head] = null;
			head = (head + 1) % array.length;
			numberOfElements--;
			return result;
		}
	}

	public int size() {
		return numberOfElements;
	}
	
	public boolean isEmpty() {
		return (numberOfElements == 0);
	}

	public boolean isFull() {
		return (numberOfElements == array.length);
	}

}

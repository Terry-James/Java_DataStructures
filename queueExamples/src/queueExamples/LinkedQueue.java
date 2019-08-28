package queueExamples;

public class LinkedQueue<T> implements QueueInterface<T> {
	private LinkedList<T> head;
	private LinkedList<T> tail;
	private int numberOfElements = 0;
	
	LinkedQueue(){
		head = null;
		tail = null;
	}

	public void enqueue(T input) throws QueueOverflowException {
		LinkedList<T> newNode = new LinkedList<T>(input);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			tail.setLink(newNode);
			tail = newNode;
			numberOfElements++;
		}
	}

	public T dequeue() throws QueueUnderflowException {
		if(isEmpty()) {
			throw new QueueUnderflowException("Invalid: Trying to dequeue and empty queue.");
		}
		else {
			T result = head.getInfo();
			head = head.getLink();
			if(head == null) {
				tail = null;
			}
			numberOfElements --;
			return result;
		}
	}

	@Override
	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		return (tail == null && head == null);
	}

	@Override
	public boolean isFull() {
		return false;
	}

}

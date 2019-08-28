package queueExamples;

public class LinkedQueue<T> implements QueueInterface<T> {
	private int head = 0;
	private int tail;
	private int numberOfElements = 0;
	
	LinkedQueue(){
		head = null;
		tail = null;
	}

	@Override
	public void enqueue(T input) throws QueueOverflowException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}

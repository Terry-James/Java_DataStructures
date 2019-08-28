package queueExamples;

public interface QueueInterface<T> {
	 void enqueue(T input) throws QueueOverflowException;
	 T dequeue() throws QueueUnderflowException;
	 int size();
	 boolean isEmpty();
	 boolean isFull();
}

package stackExamples;

public interface StackInterface<T> {
	void push(T input) throws StackOverflowException;
	void pop() throws StackUnderflowException;
	T top() throws StackUnderflowException;
	boolean isFull();
	boolean isEmpty();
}

package stackExamples;
/*
 * Terry James
 * Stack examples
 * 8/23/2019
 * 
 * A class to implement a stack using a bounded array. Bounded means that the 
 * array has a limited capacity and doesn't get any bigger.
 */
public class StackArray<T> implements StackInterface<T> {
	private final int size = 10;
	private T[] array;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	StackArray(){
		array = (T[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	StackArray(int newSize){
		array = (T[]) new Object[newSize];
	}
	
	@Override
	public void push(T input) {
		if(isFull()) {
			throw new StackOverflowException("Invalid: Trying to push to a full stack.");
		}
		else {
			array[index] = input;
			index++;
		}
	}

	@Override
	public void pop() {
		if(isEmpty()) {
			throw new StackUnderflowException ("Invalid: Trying to pop from an empty stack.");
		}
		else {
			array[index - 1] = null;
			index--;
		}
	}

	@Override
	public T top() {
		T topElement = null;
		if(isEmpty()) {
			throw new StackUnderflowException ("Invalid: Trying to remove from an empty stack.");
		}
		else {
			topElement = array[index - 1];
			index--;
		}
		return topElement;
	}

	@Override
	public boolean isFull() {
		return (index == array.length - 1);
	}

	@Override
	public boolean isEmpty() {
		return (index == 0);
	}
}

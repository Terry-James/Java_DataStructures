package stackExamples;

/*
 * Terry James
 * Stack examples
 * 8/23/2019
 * 
 * A class to implement a stack using an unbound array or an array list. Unbounded
 * means that the array's capacity can grow with the number of elements added to it.
 */
public class StackArrayList<T> implements StackInterface<T>{
	private final int size = 5;
	private T[] list;
	private int capacity;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	StackArrayList(){
		list = (T[]) new Object[size];
		capacity = list.length;
	}
	@Override
	public void push(T input){
		if(index == list.length) {
			@SuppressWarnings("unchecked")
			T[] newList = (T[]) new Object[2 * capacity];
			for(int i = 0; i < capacity; i ++) {
				newList[i] = list[i];
			}
			list = newList;
			capacity = list.length;
		}
		list[index] = input;
		index++;
		
	}

	@Override
	public void pop() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException("Invalid: Trying to pop from an empty stack.");
		}
		list[index - 1] = null;
		index--;
	}

	@Override
	public T top() throws StackUnderflowException {
		T topStack;
		if(isEmpty()) {
			throw new StackUnderflowException("Invalid: Trying to pop from an empty stack.");
		}
		else {
			topStack = list[index - 1];
			index--;
		}
		return topStack;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (index == 0);
	}
	
}

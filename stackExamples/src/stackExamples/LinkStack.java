package stackExamples;

/*
 * Terry James
 * Linked List Stack
 * 8/26/2019
 * 
 * A class that implements a stack using linked list.
 */

public class LinkStack<T> implements StackInterface<T> {
	private LinkedList<T> top; //creates a linked list node to start the stack.
	
	LinkStack(){
		top = null; //sets top to null this is useful to find out when the stack is empty.
	}

	//Create a new node and link it to the current node which is top.
	public void push(T input){
		LinkedList<T> newNode = new LinkedList<T>(input);
		newNode.setLink(top);
		top = newNode;
	}

	//Remove the current node and set link to previous node
	//This could also be written to return the top element before setting to previous link
	public void pop() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException("Invalid: Trying to pop from an empty stack.");
		}
		else {
			//T result = top.getInfo(); // use if you want pop to return and delete.
			top = top.getLink();
			//return result;

		}
	}

	//This is technically not need as pop can be written to do both the work of pop and top.
	public T top() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException("Invalid: Trying to pop from an empty stack.");
		}
		else {
			return top.getInfo();
		}
	}
	//Linked list will never be full.
	public boolean isFull() {
		return false;
	}

	//Return true if the linked list is empty(null)
	public boolean isEmpty() {
		return (top == null);
	}
}

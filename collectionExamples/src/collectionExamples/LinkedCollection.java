package collectionExamples;

/*
 * Terry James
 * Collections
 * 9/9/2019
 * 
 * This class show one example of implementing a collection using an Linked List.
 *
 */
public class LinkedCollection<T> implements CollectionInterface<T> {
	private LinkedList<T> head;
	private int numberOfElements = 0;
	
	protected boolean found;
	protected LinkedList<T> location;
	protected LinkedList<T> previous;
	
	LinkedCollection(){
		numberOfElements = 0;
		head = null;
	}
	
	protected void find(T target) {
		location = head;
		found = false;
		while(location != null) {
			if(location.getInfo().equals(target)) {
				found = true;
				break;
			}
			else {
				previous = location;
				location = location.getLink();
			}
		}
	}
	
	@Override
	public boolean add(T input) {
		LinkedList<T> newNode = new LinkedList<>(input);
		newNode.setLink(head);
		head = newNode;
		numberOfElements++;
		return true;
	}

	@Override
	public T get(T target) {
		find(target);
		if(found) {
			return(location.getInfo());
		}
		else {
			return null;
		}
	}

	@Override
	public boolean contains(T target) {
		find(target);
		return found;
	}

	@Override
	public boolean remove(T target) {
		find(target);
		if(found) {
			if(head == location) {
				head = head.getLink();
			}
			else {
				previous.setLink(location.getLink());
				numberOfElements--;
			}
			
		}
		return found;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (numberOfElements == 0);
	}

	@Override
	public int size() {
		return numberOfElements;
	}

}

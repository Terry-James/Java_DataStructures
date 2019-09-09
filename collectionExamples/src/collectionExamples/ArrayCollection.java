package collectionExamples;

/*
 * Terry James
 * Collections
 * 9/9/2019
 * 
 * This class show one example of implementing a collection using an array.
 *
 */
public class ArrayCollection<T> implements CollectionInterface<T> {
	private final int CAP = 50;
	private T[] array;
	private int numberOfElements = 0;
	private boolean found;
	private int location;
	
	ArrayCollection(){
		array = (T[]) new Object[CAP];
	}
	
	ArrayCollection(int size){
		array = (T[]) new Object[size];
	}

	protected void find(T target) {
		location = 0;
		found = false;
		
		while(location < numberOfElements) {
			if(array[location].equals(target)) {
				found = true;
				break;
			}
			else {
				location++;
			}
		}
	}
	@Override
	public boolean add(T input) {
		if(isFull()) {
			return false;
		}
		else {
			array[numberOfElements] = input;
			numberOfElements++;
			return true;
		}
	}

	@Override
	public T get(T target) {
		find(target);
		if(found == true) {
			return array[location];
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
		if(found == true) {
			array[location] = array[numberOfElements - 1];
			array[numberOfElements - 1] = null;
			numberOfElements--;
			
		}
		return found;
	}

	@Override
	public boolean isFull() {
		return (numberOfElements == array.length);
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

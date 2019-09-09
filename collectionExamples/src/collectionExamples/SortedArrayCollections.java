package collectionExamples;

/*
 * Terry James
 * Collections
 * 9/9/2019
 * 
 * This class show one example of implementing a collection using a sorted array.
 *
 */
public class SortedArrayCollections<T> implements CollectionInterface<T> {
	private final int CAP = 50;
	private T[] array;
	private int numberOfElements = 0;
	
	protected int location;
	protected boolean found;
	
	SortedArrayCollections(){
		array = (T[]) new Object[CAP];
	}
	
	SortedArrayCollections(int size) {
		array = (T[]) new Object[size];
	}
	
	protected void increaseSize() {
		int currentSize = array.length;
		int newSize = currentSize * 2;
		T[] newArray = (T[]) new Object[newSize];
		
		for(int i = 0; i < currentSize; i++) {
			newArray[i] = array[i];
		}
		
		array = newArray;
	}
	
	protected void find(T target) {
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
			increaseSize();
		}
		find(input);
		for(int i = numberOfElements; i > location; i--) {
			array[i] = array[i - 1];
			array[location] = input;
			numberOfElements++;
		}
		return true;
	}
	
	@Override
	public T get(T target) {
		find(target);
		if(found) {
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
		if(found) {
			array[location] = array[location - 1];
			array[location - 1] = null;
			numberOfElements--;
			return true;
		}
		else {
			return false;
		}
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

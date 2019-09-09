package collectionExamples;

/*
 * Terry James
 * Collections
 * 9/9/2019
 * 
 * An interface for collection that can be used to implement specific types of collection ADT's.
 *
 */

public interface CollectionInterface<T> {
	boolean add(T input);
	//return true if success, false if fail
	T get(T target);
	//return element e if e.equals(target)
	//return null if does not exist
	boolean contains(T target);
	//return true if target exist, false if it does not
	boolean remove(T target);
	//return true if target element exist and is removed, false if it does not exist
	boolean isFull();
	//return true if collection is full, false if not full
	boolean isEmpty();
	//return true if collection is empty, false if it has at least one element
	int size();
	//return the number of elements in the collection
}

package collectionExamples;

public interface BagInterface<T> extends CollectionInterface<T> {
	T grab();
	//if not empty returns a random element from the bag.
	int count(T target);
	//counts the number of times target appears in the bag.
	int removeAll(T target);
	//removes all target elements from the bag.
	void clear();
	//removes all elements from the bag.
}

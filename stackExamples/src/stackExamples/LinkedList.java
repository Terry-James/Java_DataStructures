package stackExamples;

public class LinkedList<T> {
	private T info;
	private LinkedList<T> link;
	
	LinkedList(T input){
		info = input;
		link = null;
	}
	
	public void setInfo(T input) {
		info = input;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void setLink(LinkedList<T> nextLink) {
		link = nextLink;
	}
	
	public LinkedList<T> getLink(){
		return link;
	}
}

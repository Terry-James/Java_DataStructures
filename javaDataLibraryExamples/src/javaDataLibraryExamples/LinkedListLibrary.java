package javaDataLibraryExamples;

import java.util.LinkedList;

public class LinkedListLibrary {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("Frank");
		myList.add("Kevin");
		myList.add("Sam");
		myList.add("Dean");
		myList.add("Castial");
		myList.add("Bobby");
		myList.add("Winchester");
		
		System.out.println(myList.get(3));		
		System.out.println(myList.toString());
		System.out.println(myList);

	}

}

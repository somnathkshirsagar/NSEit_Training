package Day5;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		 LinkedList<String> ar = new LinkedList();

		 	ar.add("India");
		 	ar.add("China");
		 	ar.add("Japan");
		 	ar.add("Nepal");
		 	ar.add("Nepal");	 	
		 	
		ListIterator ltr = ar.listIterator(); // Creating an object of listIterator class
		
		System.out.println("List elements in forward direction..");
		while(ltr.hasNext()) // hasNext method used to check wheather the next line/sequence has element or not
		System.out.println(ltr.next()); // next() uses the next element
		
		System.out.println("List elements in backward direction..");
		while(ltr.hasPrevious())// hasPrevious used to check weather the previous line/sequence has element or not
		System.out.println(ltr.previous()); //previous() uses the previous element

		 }

}

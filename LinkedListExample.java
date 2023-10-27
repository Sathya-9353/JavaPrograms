package collectionprograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l= new LinkedList<String>();
//		l.add("Name");
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		System.out.println(l);
		//methods in linkedlist
		
		//reverse Arraylist
		Collections.reverse(l);
		System.out.println(l);
		
		//reverseOrder
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		//Shuffle
		Collections.shuffle(l);
		System.out.println(l);
		
		//addFirst,addLast,
		l.addFirst("sheebha");
		l.addLast("k s");
		
		System.out.println(l);
		
		//removeFirst,removeLast()
	
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println("after removing "+l);
	}

}

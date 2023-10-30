package collectionprograms;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistexample2 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("name");
		ll.add("a");
		ll.add("B");
		ll.add("C");
		ll.add(null);
		
		System.out.println(ll);
		
//		using index value
//		ll.add(0, "sangeetha");
//		System.out.println("Inserting using index values "+ll);
		
		//ll.contains(100);
//		System.out.println(ll.contains(150));
//		System.out.println(ll.contains(2001));
		
//		//al.isEmpty();
//		System.out.println(ll.isEmpty());
		
		//object.Size();
//		System.out.println("The size of the ArrayList "+ ll.size());
		
//		//for loop
//		for(int i =0; i<ll.size(); i++) {
//			System.out.println(ll.get(i));
//		}
		
		//for each loop
//		for(Object o: ll ) {
//			System.out.println(o);
//		}
		
//		Iterator itr = ll.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());     //it will print the values
//		}
		System.out.println(ll.remove(3));
		
	
	}

}

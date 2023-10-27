package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();   
		
//		ArrayList<String> al1=new ArrayList<String>(); // to use 
//		List<String>l = new ArrayList<String>();

		ArrayList al = new ArrayList();
		al.add("SATHYA");
		al.add(100);
		al.add(2001);
		al.add(12.5f);
		al.add(true);
		al.add(14.5);
		System.out.println("After inserting values "+al);
		
		//using index value
//		al.add(0, "sangeetha");
//		System.out.println("Inserting using index values "+al);
//		
//		//al.contains(100);
//		System.out.println(al.contains(150));
//		System.out.println(al.contains(2001));
//		
//		//al.isEmpty();
//		System.out.println(al.isEmpty());
//		
		//object.Size();
//		System.out.println("The size of the ArrayList "+ al.size());
		
//		//for loop
//		for(int i =0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		//for each loop
//		for(Object o: al ) {
//			System.out.println(o);
//		}
//		
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());     //it will print the values
//		}
		System.out.println(al.remove(3));
		
		
	
	}

}

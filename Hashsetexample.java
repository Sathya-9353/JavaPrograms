package collectionprograms;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) {
		
		HashSet<String> h= new HashSet<>();
		h.add("A");
		h.add("B");
		h.add("C");
		
		System.out.println(h);
		
//		h.add("sangeetha");
//		System.out.println("Inserting using index values "+h);
//		
//		System.out.println(h.add("SATHYA"));
//		
//		System.out.println(h.contains(150));
		
//		for(Object o: h ) {
//			System.out.println(o);
//		}
		
//		Iterator itr = h.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());     //it will print the values
//		}
//		System.out.println(h.remove(3));
		
		Object[] array=h.toArray();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}

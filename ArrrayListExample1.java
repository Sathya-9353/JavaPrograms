package collectionprograms;

import java.util.ArrayList;

public class ArrrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
//		ArrayList<String> al = new ArrayList<string>();
		al.add("Cat");
		al.add("Dog");
		al.add("Cow");
		al.add("Goat");
		System.out.println(al);
		
		//copying values from one arraylist to another arraylist
		ArrayList al1 = new ArrayList();
//		ArrayList<String> al1 = new ArrayList<string>();
		al1.add(al);
		System.out.println(al1);
		
		
		System.out.println(al1.removeAll(al1));
		System.out.println(al1);
	}

}

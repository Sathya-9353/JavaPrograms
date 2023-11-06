package StreamAPIprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.Collections;

public class Filterexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(40);
		al.add(21);
		al.add(23);
		al.add(25);
		System.out.println(al);
		List<Integer>evennumber=al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even number "+evennumber);
		
		List<Integer>oddnumber=al.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println("Odd number "+oddnumber);
		
//		List<Integert> ascendingorder =al.stream().sorted((i1, i2))-> i1.compareTo(i2)).toList();
		
		
	}

}

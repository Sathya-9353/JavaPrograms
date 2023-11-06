package StreamAPIprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		
		marks.add(10);
		marks.add(40);
		marks.add(21);
		marks.add(23);
		marks.add(25);
		System.out.println(marks);
		List<Integer> studentmarks = marks.stream().map((i)->i+5).collect(Collectors.toList());
		System.out.println(studentmarks);
		
		long count=marks.stream().count();
		System.out.println(count);
		
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		
		
		List<Integer> ll = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(ll);
		
		List<Integer> ll1 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(ll1);
		
		Integer lt= marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(l);
	}

}

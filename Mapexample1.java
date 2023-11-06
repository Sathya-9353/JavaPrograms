package StreamAPIprogram;

import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import java.util.stream.Collectors;

public class Mapexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> employee=new ArrayList<>();
		employee.add(10000);
		employee.add(25000);
		employee.add(30000);
		
		List<Integer> salary = (List<Integer>) employee.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(salary);
	}

}

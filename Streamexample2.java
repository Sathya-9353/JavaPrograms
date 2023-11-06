package StreamAPIprogram;

import java.util.ArrayList;

class employee{
	private String name;
	private String work;
	private int salary;
	
	public employee(String name, String work, int salary) {
		super();
		this.name = name;
		this.work = work;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", work=" + work + ", salary=" + salary + "]";
	}
	
}

public class Streamexample2 {

	public static void main(String[] args) {
		ArrayList<employee> e= new ArrayList<>();
		
		e.add(new employee("Bob", "Software Enginer",300000));
		e.add(new employee("Alice", "Manger",700000));
		e.add(new employee("Johni", "Trainer",300000));
		
		System.out.println(e);
		
		long count=e.stream().count();
		System.out.println(count);
		

	}

}

package Encapsulation;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.age= age;
	}
	public String getname(){
		return name;
	}
	public int getage() {
		return age;
	}
	
	public void setname(String name) {
		this.name =name;
//		this.age= age;
	}
	public void setage(int age) {
		// TODO Auto-generated method stub
		this.age= age;
	}
		
}

public class Demo1Encapsule {

	public static void main(String[] args) {
		Person p = new Person("sathya", 22);
		
		System.out.println("Name of the person is "+ p.getname());
		System.out.println("Age is "+p.getage());
		

	}

}

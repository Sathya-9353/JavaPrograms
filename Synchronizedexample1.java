package Threadprogram;
class Main2 extends Thread{
	public void message(String name, int age) {
		for(int i=0; i<=5; i++) {
			System.out.println("Enter details :" +name+" "+age);
		}
	}
}
class Mythread3 extends Thread{
	Main2 m;
	String name;
	int age;
	
	public Mythread3(Main2 m, String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void run() {
		m.message(name,age);
	}
	}
public class Synchronizedexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m = new Main2();
		Mythread3 mt= new Mythread3(m, "SATHYA", 22);
		mt.start();
		
		
		
	}

}

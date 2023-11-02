package Threadprogram;

class dogs extends Thread{
	public void bark() throws InterruptedException {
		for(int i=0; i<=5; i++) {
		System.out.println("Dog is bark");
		Thread.sleep(200);
		Thread.yield();
	}
}
class Cat extends Thread{
	dogs d;

	public Cat(dogs d) {
		super();
		this.d = d;
	}
	public void run() {
		try {
			d.bark();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

public class Threadexample2 {

	public static void main(String[] args) {
		dogs d= new dogs();
		
		

	}

}

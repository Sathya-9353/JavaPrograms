package Threadprogram;

class Main extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
				System.out.println(i);
		}
	}
}
class Main1 extends Thread{
	public void run() {
		for(int i=1; i<=4; i++) {
			System.out.println(i);
		}
	}
}

public class Threaexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m= new Main();
		Main1 m1= new Main1();
		m.start();
		m.setName("SATHYA");
		m.setPriority(10);
		System.out.println(m.getName() + m.getPriority());
		m1.start();

	}

}

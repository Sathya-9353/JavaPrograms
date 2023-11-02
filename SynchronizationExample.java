package Threadprogram;
class Display extends Thread{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0; i<=5; i++) {
//			Thread.sleep(1);
			Thread.yield();
		System.out.println("Good Morning " +name);
	}
}
}
class Mythread2 extends Thread{
	Display d;
	String name;
	public Mythread2(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Display d= new Display();
		Mythread2 mt= new Mythread2(d, "SATHYA");
		Mythread2 mt1= new Mythread2(d, "VARSHA");
		Mythread2 mt2= new Mythread2(d, "Navya");
		mt.start();
		mt1.start();
		mt2.start();
	}

}

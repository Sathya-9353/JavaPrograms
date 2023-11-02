package Threadprogram;

class  Mythread extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}
}

public class Demo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread m=new Mythread();
		m.start();

	}

}

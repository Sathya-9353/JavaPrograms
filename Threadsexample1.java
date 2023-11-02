package Threadprogram;
class Fact extends Thread{
	public void run() {
		int num =121;
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			System.out.println(fact);
		}
	}
}
class Palindrome extends Thread{
	public void run() {
		int num=121;
		int temp=num;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;       //1
			rev=rev*10+rem;    //0*10+1=1 
			temp=temp/10;      //121/10=12
			System.out.println(rev);
		}
		if(rev==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		}
	}


public class Threadsexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact ob= new Fact();
		Palindrome ob1 = new Palindrome();
		ob.start();
		ob1.start();
		ob.getPriority();

	}

}

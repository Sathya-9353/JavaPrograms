package ObjectOrientedPrograms;

public class Demo1 {
	
	public int  addition(int a, int b) {
		int sum=a+b;
		System.out.println("addition of two numbers is "+sum);
		return sum;
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.addition(10, 30);
	}

}

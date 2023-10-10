package Operators;
//a+b
//+,-,*,/,%

public class ArthmeticOperator {

	public static void main(String[] args) {
		int a=20;
		int b =10;
		int c = a+b;
		System.out.println("Addition of two numbers is "+c);
		
		int d = 20;
		int e = c-d;
		System.out.println("Subtraction of two numbers is "+e);
		
		int f =30;
		int g = 20;
		int h = c*d;
		System.out.println("Multiplication of two numbers is "+h);
		
		int m= 10;
		int n= 20;
		int o=m%n;
		System.out.println("Division of two numbers is "+o);
		
		int p=30;
		int s=10;
		int t=p%s;
		System.out.println("Mod of two numbers is "+t);
	}

}

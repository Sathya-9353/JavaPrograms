package BasicPrograms;

import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int age = 19;
//		if (age>18) {
//			System.out.println(" Eligible to Vote");
//		}
//		else {
//			System.out.println("Not Eligible");
//		}
		
//		int n=6;
//		if(n%2==0) {
//			System.out.println("Even No ");
//		}
//		else {
//			System.out.println("Not Even no");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Greater numbers");
		int n=sc.nextInt();
		System.out.println("Enter Lesser number");
		int n1=sc.nextInt();
		if(n>n1||n<n1) {
			System.out.println(n);
		}
		else{
			System.out.println(n1);
		}

	}

}

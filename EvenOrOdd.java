package Coditions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=6;
//		if(n%2==0) {
//		System.out.println("Even No ");
//	}
//	else {
//		System.out.println("Not Even no");
//	}
//		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n =sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		
		
	}

}

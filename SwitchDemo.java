package Coditions;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the Option");
//		int num = s.nextInt();
//		int num=1;
//		switch(num) {
//		
//		case 1:
//			System.out.println("option 1");
////			break;
//			
//		case 2:
//			System.out.println("option 2");
//			//break;
//			
//		case 3:
//			System.out.println("option 3");
//			break;
//		default :
//			System.out.println("Invaild");
		
		
//		int x=1+1;
//		int y=2;
//		switch(x) {
//		
//		case 1+1:
//			System.out.println("12");
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter ur Choice");
		int Choice= s.nextInt();
		switch(Choice) {
		default:
			System.out.println("Invaild");
			
		case 1:
			System.out.println("Register here");
			
		case 2:
			System.out.println("Login");
			
		case 3:
			System.out.println("View Profile");
			
		}

	}

}

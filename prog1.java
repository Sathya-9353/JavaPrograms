package Coditions;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		if (age>18) {
			System.out.println(" Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible");
		}
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Age ");
//		int age =sc.nextInt();
//		if(age>18) {
//			System.out.println("Eligible");
//		}
//		else {
//			System.out.println("Not Eligible");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score");
		int Score= sc.nextInt();
		if(Score>90) {
			System.out.println("Grade - A+");
		}
		else if(Score<=90 && Score>80) {
			System.out.println("Grade - A");
		}
		else if(Score<=80 && Score>70) {
			System.out.println("Grade - B");
		}
		else if(Score<=70 && Score>60) {
			System.out.println("Grade - B+");
		}
		else if(Score<=60 && Score>50) {
			System.out.println("Grade - C");
		}
		else if(Score<=50 && Score>40) {
			System.out.println("Grade - P");
		}
		else{
			System.out.println("fail");
		}
		

	}

}

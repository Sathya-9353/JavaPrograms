package LoopingStatements;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num<=100) {
			num++;
			System.out.println(num);
		
		}

	}

}

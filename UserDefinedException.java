package exceptionhandlingprograms;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
//		System.out.println("message");
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
//		int age =16;
//		try {
//		if(age>=18) {
//			System.out.println("Elegible for voting");
//		}
//		else {
////			System.out.println("Not elegible");
//			throw new MyException("not elegible");
//		}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try {
			if(age>=18) {
				System.out.println("Elegible to vote");
			}
			else {
				throw new MyException("Not elegible");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

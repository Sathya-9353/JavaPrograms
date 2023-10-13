package Coditions;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the letter grade: ");
		System.out.println("Enter the Grade");
		int Score=sc.nextInt();

		switch(Score) {
		case 100:                      //case A : System.out.println("Your grade is Excellent"); break;
			System.out.println("A+");
			break;
		case 90:                      //case B: System.out.println("Your grade  is good"); break;
			System.out.println("A");
			break;                  
		case 80:                       //case c: System.out.println("Your grade  is Satisfactory"); break;
			System.out.println("B");
			break;
		case 70:
			System.out.println("B+");
			break;
		case 60:
			System.out.println("c");
			break;
		case 50:
			System.out.println("D");
			break;
		case 40:
			System.out.println("P");
		case 30:
			System.out.println("F");
			break;
		}
		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter your numeric score: ");
//		double score = scanner.nextDouble();
//
//		char grade;
//
//		// Use a switch-case statement to determine the grade
//		switch ((int) score / 10) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//		}
//
//		System.out.println("Your grade is: " + grade);
//			    }
		
//		  Scanner scanner = new Scanner(System.in);
//	        
//	        System.out.println("Enter your letter grade: ");
//	        char grade = scanner.next().charAt(0);
//
//	        switch (grade) {
//	            case 'A':
//	                System.out.println("Your grade is Excellent");
//	                break;
//	            case 'B':
//	                System.out.println("Your grade is Good");
//	                break;
//	            case 'C':
//	                System.out.println("Your grade is Satisfactory");
//	                break;
//	            case 'D':
//	                System.out.println("Your grade is Needs Improvement");
//	                break;
//	            case 'F':
//	                System.out.println("You"
//	                		+ "r grade is Fail");
//	                break;
//	            default:
//	                System.out.println("Invalid grade");
//	        }
//	    }
//	}
			
	}

}

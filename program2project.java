package program1;

import java.util.Scanner;

public class program2project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Here is Choices for main menu. ");
        System.out.println("\nEnter Student Name:");
    	String name = sc.nextLine();
    	Student student = new Student(name);

        
        while(true) {
        int choice;
        do {
        	System.out.println("\n1. Enter student ID");
            System.out.println("2. Enroll in a course");
            System.out.println("3. Pay tuition fees");
            System.out.println("4. View balance");
            System.out.println("5. Show status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
            	System.out.println("Enter Student ID:");
            	int ID = sc.nextInt();  
            		for(int i =0; i==ID; i++) {
            			System.out.println("The selected Id has been selected already, Please select a different ID:");
            			String StudentID=sc.nextLine();
            		}
            	break;
            case 2:
            	System.out.println("Enter the course to Enroll:");
            	String course=sc.next();
                student.enrollCourse(course);
            	break;
            case 3:
            	System.out.println("Enter amount to pay fee:$");
            	double amount=sc.nextDouble();
            	student.payTuition(amount);
            	break;
            case 4:
            	student.viewBalance();
            		break;
            case 5:
            	student.showStatus();
            case 0:
            	System.out.println("Student is Enrolled. ThankYou!");
            	break;
            default :
            	System.out.println("Invalid choice. Please try again.");
            	break;
            	}
            	
        }while (choice != 0);
        
        sc.close();
        }
	}

}

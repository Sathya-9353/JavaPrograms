package program1;

import java.util.Scanner;

public class prog2project {

	public static void main(String[] args) {
		prog1project p = new prog1project();
		Scanner sc = new Scanner(System.in);
        System.out.print("Here is Choices for main menu. ");
        
        while(true) {
        int choice;
        do {
        	System.out.println("\n1. Enter the Student Name");
            System.out.println("2. Enroll in a course");
            System.out.println("3. Pay tuition fees");
            System.out.println("4. View balance");
            System.out.println("5. Show status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
            	System.out.println("Enter Student Name:");
            	String string = sc.nextLine();
            	p.setName(string);
//            	break;
            	System.out.println("Enter Student ID:");
            	int ID = sc.nextInt();  
            		for(int i =0; i==ID; i++) {
            			System.out.println("The selected Id has been selected already, Please select a different ID:");
            			String StudentID=sc.nextLine();
            		}
            	break;
            case 2:
            	System.out.println("Enter the course to Enroll:");
            	String string1=sc.nextLine();
            	
            	break;
            case 3:
            	System.out.println("Enter amount to pay fee:$");
            	double amount=sc.nextDouble();
            	break;
            case 4:
            		p.viewBalance();
            		break;
            case 5:
            	p.showStatus();
            case 0:
            	System.out.println("Student is Enrolled. Thank You!");
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

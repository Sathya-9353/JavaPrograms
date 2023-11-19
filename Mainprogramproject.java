package program1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class Student {
    private String studentID;
    private String name;
    private List<String> enrolledCourses;
    private double balance;

    // Constructor
    public Student(String name) {
        this.studentID = generateStudentID();
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.balance = 0.0;
    }

    // Generate unique 5-digit student ID
    private String generateStudentID() {
        return UUID.randomUUID().toString().substring(0, 5);
    }

    // Getter methods
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    // Methods for Student operations
    public void enrollCourse(String course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in course: " + course);
    }

    public void viewBalance() {
        System.out.println("Balance for " + name + ": $" + balance);
    }

    public void payTuition(double amount) {
        balance -= amount;
        System.out.println(name + " paid tuition fees: $" + amount);
        viewBalance();
    }

    public void showStatus() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses: " + enrolledCourses);
        viewBalance();
    }
}
public class Mainprogramproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);

        int choice;
        do {
            System.out.println("\n1. Enroll in a course");
            System.out.println("2. View balance");
            System.out.println("3. Pay tuition fees");
            System.out.println("4. Show status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to enroll: ");
                    String course = scanner.next();
                    student.enrollCourse(course);
                    break;
                case 2:
                    student.viewBalance();
                    break;
                case 3:
                    System.out.print("Enter tuition fees to pay: $");
                    double amount = scanner.nextDouble();
                    student.payTuition(amount);
                    break;
                case 4:
                    student.showStatus();
                    break;
                case 0:
                    System.out.println("Exiting details. ThankYou!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
package program1;

public class program1project {
	private String Name;
	private int StudentID;
	private String EnrollCourse;
	private double TutionFee;
	private double balance;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getEnrollCourse() {
		return EnrollCourse;
	}
	public void setEnrollCourse(String enrollCourse) {
		EnrollCourse = enrollCourse;
	}
	public double getTutionFee() {
		return TutionFee;
	}
	public void setTutionFee(double tutionFee) {
		TutionFee = tutionFee;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	 public void enrollCourse(String course, String name) {
	        System.out.println(name + " enrolled in course: " + course);
	        viewBalance();
	    }
	 public void payTuition(String name, double amount) {
	        balance -= amount;
	        System.out.println(name + " paid tuition fees: $" + amount);
	        viewBalance();
	    }

	    public void viewBalance() {
	        System.out.println("Balance amount is "  + ": $" + balance);
	    }

	   
	    public void showStatus() {
	        System.out.println("Student ID: " + StudentID);
	        System.out.println("Name: " + Name);
	        System.out.println("Enrolled Courses: " + EnrollCourse);
	        System.out.println("Balance amount is: "+ balance);
	        viewBalance();
	    }
	}


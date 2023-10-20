package Encapsulationprogram;

class College{
	private String Studentname;
	private int Rollno;
	private String Fathername;
	private String Mothername;
	
	
	public College (String Studentname, int Rollno, String Fathername, String Mothername){
		this.Studentname=Studentname;
		this.Rollno=Rollno;
		this.Fathername=Fathername;
		this.Mothername=Mothername;
	}
		
		public String getStudentname() {
			return Studentname;
		}
		public int getRollno() {
			return Rollno;
		}
		public String getFathername() {
			return Fathername;
		}
		public String getMothername() {
			return Mothername;
		}
		
		public void setStudetname(String Studentname, int Rollno) {
			this.Studentname=Studentname;
			this.Rollno=Rollno;
		}
}

public class Demo4encapsule {

	public static void main(String[] args) {
		College de=new College("Rohith", 122023, "Shiva", "Sita");
		
		System.out.println("Student name is "+de.getStudentname());
		System.out.println("Student rollno is "+de.getRollno());
		System.out.println("Student father name is "+de.getFathername());
		System.out.println("Student mother name is "+de.getMothername());

	}

}

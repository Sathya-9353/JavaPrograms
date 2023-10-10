package BasicPrograms;

public class Demo {

	public static void main(String[] args) {
		//float MarksPerSubject= 100;
		int MarksPerSubject= 100;
		int Maths= 80;
		int IoT= 85;
		int NoSql= 85;
		int English = 90;
		int Hindi = 97;
		int Management= 70;
		int TotalMarks= Maths+IoT+NoSql+English+Hindi+Management;
		//float Percentage= (TotalMarks/(6 * MarksPerSubject))*100f;
		//int Percentage= TotalMarks/6;
		float Percentage= (TotalMarks/6 * MarksPerSubject)/100f;
		System.out.println("Total is "+TotalMarks);
		System.out.println(Percentage);
	}

}

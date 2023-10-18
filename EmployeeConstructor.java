package constructors;

public class EmployeeConstructor {
	String name;
	int age;
	int Salary;
	String Department;
	String Email;
	int Phoneno;
	

	public EmployeeConstructor(String name, int age, int Salary, String Department, String Email, int Phoneno) {
		this.name=name;
		this.age= age;
		this.Salary= Salary;
		this.Department= Department;
		this.Email=Email;
		this.Phoneno=Phoneno;
	}


	public static void main(String[] args) {
		EmployeeConstructor Ec=new EmployeeConstructor("Rohith", 34, 40000, "Executor", "see@34", 875479686);
		System.out.println(Ec.name +" "+ Ec.age +"  "+ Ec.Salary +"  "+ Ec.Department);
		System.out.println(Ec.Email);
		System.out.println(Ec.Phoneno);
//		System.out.println(Ec.name);
//		System.out.println(Ec.age);
//		System.out.println(Ec.Salary);
//		System.out.println(Ec.Department);
		
//		EmployeeConstructor Ec1=new EmployeeConstructor("Sangeetha", 21, 50000, "Executor1");
//		System.out.println(Ec1.name +" "+ Ec1.age +"  "+ Ec1.Salary +"  "+ Ec1.Department);
//		
//		EmployeeConstructor Ec2=new EmployeeConstructor("Varsha", 21, 70000, "CEO Friend");
//		System.out.println(Ec2.name +" "+ Ec2.age +"  "+ Ec2.Salary +"  "+ Ec2.Department);
//		
//		EmployeeConstructor Ec3=new EmployeeConstructor("Navya", 24, 80000, "CEO");
//		System.out.println(Ec3.name +" "+ Ec3.age +"  "+ Ec3.Salary +"  "+ Ec3.Department);

	}

}

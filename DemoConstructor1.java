package constructors;

public class DemoConstructor1 {
	
	String name;//null
	int rollNo;//0
	int age;

//	public DemoConstructor1() {
//		// TODO Auto-generated constructor stub
//		this.name= name;
//		this.rollNo =rollNo;
//	}
	
	public DemoConstructor1(String name, int rollNo, int age) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.rollNo =rollNo;
		this.age = age;
	}

	public static void main(String[] args) {
//		DemoConstructor1 demo=new DemoConstructor1());
		DemoConstructor1 demo=new DemoConstructor1("Rohith", 67, 4);
		System.out.println(demo.name);
		System.out.println(demo.rollNo);
		System.out.println(demo.age);
		
		DemoConstructor1 demo1=new DemoConstructor1("Rohith", 67, 4);
		System.out.println(demo1.name);
		System.out.println(demo1.rollNo);
		System.out.println(demo1.age);
	}

}

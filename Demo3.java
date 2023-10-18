package ObjectOrientedPrograms;

class Demo{
	public void display() {           //outer the class can be accessed
		System.out.println("public");
	}
	protected void display1() {        //outer the class can be accessed
		System.out.println("protected");
	}
	void display2() {
		System.out.println("default");
	}
	private void display3() {
		System.out.println("Private");
	}
}

public class Demo3 {
	private  void display3() {
		System.out.println("private");
	}

	public static void main(String[] args) {
		Demo3 dd=new Demo3();
		Demo d = new Demo();
		d.display();
		d.display1();
		d.display2();
		dd.display3();
	}

}

package ObjectOrientedPrograms;

public class MethodDemo {
	public static void display1() {    //Static method
		 System.out.println("Static method");
	 }
	public void display() {      //Access Modifier
		System.out.println("Public method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo method =new MethodDemo();
		method.display();
		display1();   //Static method

	}

}

package ObjectOrientedPrograms;

public class DemoVoid {
	public void addition(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers is "+ sum);
	
	}
	public void subraction(int a, int b) {            //subraction 
		int sum=a-b;
		System.out.println("subraction of two number is "+sum);
		
	}
	
	public void product(int a, int b) {            //Product
		int sum=a*b;
		System.out.println("Product of two numbers is "+sum);
	}
	
	public void division(int a, int b) {
		int sum=a/b;
		System.out.println("Division of two numbers is "+sum);
	}

	public static void main(String[] args) {
		DemoVoid dv = new DemoVoid();
		dv.addition(10, 30);
		dv.subraction(16, 7);
		dv.product(12, 45);
		dv.division(143, 70);
	}

}
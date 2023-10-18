package ObjectOrientedPrograms;

public class DemoStatic {
	public static int addition(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers is "+ sum);
		return sum;
	}
	public static void subraction(int a, int b) {            //subraction 
		int sum=a-b;
		System.out.println("subraction of two number is "+sum);
		
	}
	
	public static void product(int a, int b) {            //Product
		int sum=a*b;
		System.out.println("Product of two numbers is "+sum);
	}
	
	public static void division(int a, int b) {
		int sum=a/b;
		System.out.println("Division of two numbers is "+sum);
	}

	public static void main(String[] args) {
		
		//DemoVoid dv = new DemoVoid();
		addition(10, 30);
		subraction(16, 7);
		product(12, 45);
		division(143, 70);
	}

}

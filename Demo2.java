package ObjectOrientedPrograms;

public class Demo2 {
	
	public int subraction(int a, int b) {            //subraction 
		int sum=a-b;
		System.out.println("subraction of two number is "+sum);
		return sum;
	}
	
	public int product(int a, int b) {            //Product
		int sum=a*b;
		System.out.println("Product of two numbers is "+sum);
		return sum;
	}
	
	public double division(int a, int b) {
		int sum=a/b;
		System.out.println("Division of two numbers is "+sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		d.product(50,70);
		d.subraction(60, 55);
		d.division(90, 78);
	}

}

package exceptionhandlingprograms;

//ArithmeticException
public class ExpectionDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println(100/0);
//			System.out.println("4");
//			System.out.println("5");
		}
		catch(Exception e) {             //catch(ArithmeticException ae){}
			System.out.println(e);
			e.printStackTrace();     //to get the path we should the e.455
		}
		System.out.println("Exception is handled here");
		System.out.println("4");
		System.out.println("5");

	}

}

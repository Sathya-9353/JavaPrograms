package exceptionhandlingprograms;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "Hello";
			int num =Integer.parseInt(str);
			System.out.println(num);
		}
		catch(NumberFormatException n) {
			System.out.println(n);
		}
		System.out.println("Number format exception can be handled");
	}

}

package exceptionhandlingprograms;
//NullPointerException

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int a=50/0;
//			System.out.println("This gives error");      //ArithmeticExpection
			
			int[] a1 = {1,2,3,4,5,6,7,8};
			System.out.println(a1[10]);            //Array out of bound
					
		String s =null;
//		int s1= s.length();
//		System.out.println(s1);
		System.out.println(s.length());            //Null Pointer Exception
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("exception handled");

	}

}

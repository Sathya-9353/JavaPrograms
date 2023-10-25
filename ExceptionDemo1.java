package exceptionhandlingprograms;
//ArrayoutofBound
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,2,3,4};
			System.out.println(a[50]);
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception can be handled here");

	}

}

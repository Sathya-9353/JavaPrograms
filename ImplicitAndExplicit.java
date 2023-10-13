package TypeCasting;

public class ImplicitAndExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a =123;
		int e = a;   //implicit
		System.out.println(e);
		
		int b=123;
		byte c = (byte) b;   //explicit
		System.out.println(c);
		
		int num = 1091263645;
		double d =num; //implicit
		System.out.println(d);
		
		double d1 = 2175.67;
		int i = (int)d1;    //explicit
		System.out.println("Double to int "+i);
		
		String num1 = "45";
		int num2= Integer.parseInt(num1);//explicit
		System.out.println(num2);
	}

}

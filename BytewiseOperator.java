package Operators;

public class BytewiseOperator {

	public static void main(String[] args) {
		int a= 4;
		int b =5;
		int c=a|b;          //OR 
		System.out.println(c);
		
		int p=4;
		int s=5;
		int t=p&s;          //AND
		System.out.println(t);  
		
		int d=4;
		int e=5;
		int f=d^e;           //XOR
		System.out.println(f);
		
		int x=4;
		int z=~x;            //Complement or Negation
		System.out.println(z);

	}

}

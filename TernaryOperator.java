package Operators;

//?
public class TernaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d= 40;
		int e=50;
		int max=(a>b && a>c && a>d && a>e) ? a: (b>a && b>c && b>d && b>e) ? b:
			(c>a && c>b && c>d && c>e) ? c: (d>a && d>b && d>c && d>e) ? d:e;
//		int d=(a>b && a>c) ? a: (b>a && b>c) ? b:c;
//		int c = (a>b) ? a : b;
//		System.out.println(c);
//		int c = (a>b) ? a : (a<b) ? a:b ;
		System.out.println("Largest no is "+max);
	}

}

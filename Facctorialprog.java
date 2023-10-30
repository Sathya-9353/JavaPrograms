package BasicPrograms;
import java.util.Scanner;

public class Facctorialprog {

	public static void main(String[] args) {
//		int num = 8;
//		int fact = 1;
//		int i=1;
//		while(i<=num) {
//			fact=fact*i;
//			i++;
//			System.out.println(i);
//		}
		
//		int num=720;
//		int fact = 1;
//		int i =1;
//		while(i<=num) {
//			fact = fact*i;
//			i++;
//			System.out.println(i);
//		}
//		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			System.out.println(fact);
		}
//		System.out.println(fact);	
	}

}

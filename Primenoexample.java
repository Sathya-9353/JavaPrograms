package BasicPrograms;

import java.util.Scanner;

public class Primenoexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter num: ");
			int num=sc.nextInt();
			for(int i=2; i<=num; i++) {
				int factor=0;
				for(int j=2;j<i; i++) {
					if(i%j==0) {
						factor=1;
					}
				}
				if(factor==0) {
					System.out.println(i);
				}
//				else {
//					System.out.println("Not prime");
//				}
			}
		}

	}

}

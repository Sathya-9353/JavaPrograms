package BasicPrograms;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
		int num=sc.nextInt();
		int factors =0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				factors++;
			}
		}
			if(factors == 2) {
				System.out.println("Prime no");
			}
			else {
				System.out.println("Not prime no");
			}
		}

	}

}

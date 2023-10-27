package exceptionhandlingprograms;

import java.util.Scanner;

class MyExample extends Exception{
	public MyExample(String message){
		super(message);
	}
}

public class Exceptionaforticketbook {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Tickets");
		int Totalticket= sc.nextInt();
		System.out.println("Enter the Number of tickets Required");
		int TicketRequired = sc.nextInt();
		
		try {
			if(TicketRequired<Totalticket) {
				int Available=Totalticket-=TicketRequired;
				System.out.println("Leftout tickets are: "+Available);
			}
			else {
				throw new MyExample("Tickets not Available");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	}

}

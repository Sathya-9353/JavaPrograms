package Encapsulation;

class Bank{
//	static String Branch;
	private String Bankname;
	private String name;
	private String Accountno;
	private double balance;
	
	public Bank(String Bankname, String name, String Accountno, double balance) {
		this.Bankname=Bankname;
		this.name=name;
		this.Accountno =Accountno;
		this.balance= balance;
	}
	//getter and setter 
//	public String getBranch() {
//		return Branch;
//	}
	public String getBankname() {
		return Bankname;
	}
	public  String getname() {
		return name;
	}
	public String getAccountno() {
		return Accountno;
	}
	public double getbalance() {
		return balance;
	}
//	public void setAccountno(String Accountno) {
//		this.Accountno=Accountno;
//	}
	
	public void setbalance(double balance) {
		this.balance= balance;
	}
	public double deposit(double deposit) {
//		return deposit;
		return deposit+=balance;
	}
	public double withdraw(double amount) {
//		return amount -=balance;
		if(amount >balance) {
			System.out.println("Sorry!");
		}
		else {
			System.out.println("Thank You");
		}
		return amount-=balance;
	}
}

public class Demo2Encapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank("SBI","Rohith","SBI5467",7800);
 
		System.out.println("Bank name is "+b.getBankname());
		System.out.println("Name is "+b.getname());
		System.out.println("Bank accountno is "+ b.getAccountno());
		System.out.println("Balance is "+b.getbalance());
		System.out.println("Balance after  deposit "+ b.deposit(7000));
		System.out.println("Balance after withdraw "+b.withdraw(1900));

		
	}

}

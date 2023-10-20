package Encapsulation;

public class DemoEncapsule {
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance =balance;
	}

	public static void main(String[] args) {
		DemoEncapsule de= new DemoEncapsule();
		de.setBalance(100000);
		System.out.println(de .getBalance());
	}

}

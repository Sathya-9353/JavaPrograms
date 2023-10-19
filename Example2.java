package Abstractprograms;

abstract class Fruit{
	abstract void Taste();
}
class Mango extends Fruit{

	@Override
	void Taste() {
		System.out.println("Mango is Sweet");
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m = new Mango();
		m.Taste();
	}

}

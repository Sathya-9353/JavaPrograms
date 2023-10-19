package inheritanceprogram;

class Parents {
	public void Properties() {
		System.out.println("Parent Properties");
	}
}
class Child1 extends Parents {
	public void detials() {
		System.out.println("Child from Parent Properties");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child cc= new child();
		cc.Properties();
		cc.details();
	}

}

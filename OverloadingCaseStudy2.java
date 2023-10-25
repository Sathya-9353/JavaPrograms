package polymorphismprograms;

class Case1{
	public void show(Object o) {              //Same name of the method
		System.out.println("Parent class");
	}
	public void show(String s) {
		System.out.println("Child class");
	}
}

public class OverloadingCaseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case1 ob= new Case1();
		ob.show(new Object());         //root class
		ob.show("sathya");             //sub class 
		ob.show(null);
	}

}

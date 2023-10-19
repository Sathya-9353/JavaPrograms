package Abstractprograms;

abstract class A{         //using Inheritance
	abstract void method();
}
class B extends A{

	@Override
	void method() {
		System.out.println("Abstract method implemented");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob =  new B();
		ob.method();
	}

}

package polymorphismprograms;

class Main{
	Main(){
		System.out.println("no agr constructor");
	}
	Main(int a){
		this();
		System.out.println("Parameterized");
	}
	Main(int a, int b){
		this(a);
		System.out.println("Two agruments");
	}	
}
class Main1{
	Main1(){
		super();
	}
}

public class Exampleconstructor1overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main m = new Main();     //default constructor
		Main m= new Main(16, 65);
		Main1 m1 = new Main1();
	}

}

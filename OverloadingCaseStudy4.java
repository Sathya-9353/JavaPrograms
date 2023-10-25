package polymorphismprograms;

class Case4{
	public void show(int a ) {
		System.out.println("one argu method");
	}
	public void show(int ...i) {         // only three dots not more that 
		System.out.println("Any number of arguments");
	}
}

public class OverloadingCaseStudy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case4 c=new Case4();
		c.show(10);
		c.show(20,30,40,50,60,70);

	}

}

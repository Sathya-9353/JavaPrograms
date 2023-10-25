package polymorphismprograms;

class Case2{
	public void show(String s) {
		System.out.println("String class");
	}
	public void show(StringBuffer sb) {
		System.out.println("StringBuffer class");
	}
}

public class OverloadingCaseStudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case2 ob= new Case2();
		ob.show("Null");
		ob.show(new StringBuffer());
	}

}

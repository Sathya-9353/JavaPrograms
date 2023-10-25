package polymorphismprograms;

class Case{
	public void show( float a, double b) {
		System.out.println("No argu method");
	}
	public void show(int a) {
		System.out.println("int type method");
	}
	public void show(float a) {
		System.out.println("Float type");
	}
}

public class OverloadingCaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case ob= new Case();
		ob.show(60.00f, 7.00);
		ob.show(80);
		ob.show(90.00f);
	}

}

package polymorphismprograms;

class Parents{
	public void properties() {
		System.out.println("Glod+Money+Land");
	}
	public void Marry() {
		System.out.println("Parent likes girl1+ girl2");
	}
}
class child extends Parents{
	public void Marry() {
		System.out.println("Child likes girl3+ girl4");
	}
}

public class Overridingexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parents p = new Parents();
//		p.properties();
//		p.Marry();
//		
//		child c = new child();
//		c.properties();
//		c.Marry();
		
		Parents pp = new child();    //Overriding in runtime
		pp.properties();
		pp.Marry();
		
	}

}

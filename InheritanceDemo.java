package inheritanceprogram;

//Single Parent
class Parent {
	public void Properties() {
		System.out.println("Parent Parent");
	}
}
class child extends Parent {
	public void details() {
		System.out.println("Child details with parent properties");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		child c= new child();
		c.Properties();
		c.details();

	}

}

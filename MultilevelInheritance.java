package inheritanceprogram;

class Animal {
	public void Properties() {
		System.out.println("Animal");
	}
}
class Dog extends Animal {
	public void bark() {
		System.out.println("Dog barks ");
	}
}
class puppy extends Dog {
	public void play() {
		System.out.println("Puppy use to play ");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy c=new puppy();
		c.Properties();
		c.bark();
		c.play();
	}

}

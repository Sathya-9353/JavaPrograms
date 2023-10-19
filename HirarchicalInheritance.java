package inheritanceprogram;

class animals{
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class dogs extends animals{
	public void bark() {
		System.out.println("Dog is bark");
	}
}
class Cat extends animals{
	public void meow() {
		System.out.println("Cat is meowing");
	}
}


public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs d = new dogs();
		Cat c= new Cat();
		
		d.eat();
		d.bark();
		
		c.eat();
		c.meow();
	}

}

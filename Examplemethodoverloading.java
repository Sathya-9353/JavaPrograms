package polymorphismprograms;

//Method Overloading

class Demo{
	public void add() {
		System.out.println("First method"); 
	}
	
	public void add(int a) {
//		System.out.println("Second method");
		System.out.println("Second method: "+(a+a));   //operatorOverloading (+)
	}
	public void add(int a, int b) {
		System.out.println("Third method: "+(a+b));
	}
	public void add(int a, float b) {
		System.out.println("Fourth method: "+(a+b));
	}
	public void add(float a, int b) {
		System.out.println("fifth method: "+(a+b));
	}
}

public class Examplemethodoverloading {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
//		d.add(10);
		d.add(20);
		d.add(23, 55);
		d.add(66, 67.0f);
		d.add(78.0f, 65);

	}

}

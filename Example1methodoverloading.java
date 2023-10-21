package polymorphismprograms;

class sum{
	public void add() {
		System.out.println("First method");
	}
	public void add(int a) {
		System.out.println("second method");
	}
}

public class Example1methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum m= new sum();
		m.add();
		m.add(50);
		m.add('m');
	}

}

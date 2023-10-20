package interfacesprogram;

interface parents1{
	abstract void parents1Method();
}
interface parents2{
	abstract void parents2Method();
}
class Childs implements parents1, parents2{

	@Override
	public void parents2Method() {
		System.out.println("Child class extending with parents1");
		
	}

	@Override
	public void parents1Method() {
		System.out.println("Child class extending with parents2");
		
	}
	
}

public class interfaceDemo1 {

	public static void main(String[] args) {
		Childs  ob = new Childs();
		ob.parents1Method();
		ob.parents2Method();

	}

}

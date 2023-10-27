package exceptionhandlingprograms;

class MyDemo extends Exception{
	public MyDemo(String message) {
		super(message);
	}
}

public class exceptionforthrow {

	public static void main(String[] args) {
		
		try {
			Class.forName("BasicPrograms.Days"); //non existing class name it throw exception
			System.out.println("class found");
//		}
		throw new MyDemo("class not found");
		}
		catch(Exception e) {
			System.out.println(e);
//			e.printStackTrace();
		}
//		System.out.println("class not found");
	}
}

package exceptionhandlingprograms;

//class not found Exception
public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("BasicPrograms.Days"); //non existing class name it throw exception
			System.out.println("class found");
		}
		catch(Exception e) {
			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("class not found");
	}

}

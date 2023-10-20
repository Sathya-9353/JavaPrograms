package interfacesprogram;

interface vivo{
	abstract void feature();
}

interface realme{
	abstract void camera();
}
class Version implements vivo, realme{

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("realme camera is good");
		
	}

	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("vivo feature is good");
		
	}
}

public class interfaceDemo2 {

	public static void main(String[] args) {
		Version ve=new Version();
		ve.feature();
		ve.camera();
	}

}

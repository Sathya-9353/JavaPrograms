package polymorphismprograms;

class Demo1{
	Demo1(){
		System.out.println("No agrument Constructor");
	}
	Demo1(int a){
		System.out.println("One agrument Constructor");
	}
	Demo1(int a, int b){
		System.out.println("Two agrument Constructor");
	}
	Demo1(int a, float b){
		System.out.println("Two different Constructor");
	}
}

public class Exampleconstructoroverloading {

	public static void main(String[] args) {
		Demo1 de= new Demo1();
		Demo1 de1= new Demo1(10);
		Demo1 de2= new Demo1(10,20);
		Demo1 de4=new Demo1(40, 60.5f);
		Demo1 de5=new Demo1('c'); //TypePromotion

	}

}

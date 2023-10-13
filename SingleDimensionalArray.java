package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		System.out.println(a[0]); //a[5]-ArrayIndexofBoundsExpection
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("Length of the array "+a.length);
		
		
		String[] s= {"a", "aa", "aaa"};
		System.out.println("Length of the array "+s.length);


	}

}

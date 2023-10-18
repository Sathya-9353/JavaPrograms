package ForLoopStatement;

public class UsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40};
		for(int i=0; i<num.length; i++) //i<=num.length-output is Index is out of bound for length
			System.out.println(num[i]);
	}

}

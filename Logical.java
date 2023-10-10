package Operators;

public class Logical {

	public static void main(String[] args) {
		int x=29;
		int y=31;
		if(++x<15 & ++y>16)
		{
			x++;
		}
		else {
			y++;
		}
		System.out.println(x);
		System.out.println(y);

	}

}

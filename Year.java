package BasicPrograms;

public class Year {
	enum year{
		Jan,
		Feb,
		Mar,
		April,
		May,
		Jun,
		Jul,
		AUg,
		Sept,
		Oct,
		Nov,
		Dec;
	}

	public static void main(String[] args) {
		year Month = year.Jul;
		System.out.println("Month is "+Month);

	}

}

package BasicPrograms;

public class Day {
	enum day{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Firday,
		saturday;
		
	}

	//private static final Day Sunday = null;
	//private static final Day Monday = null;

	public static void main(String[] args) {
	//	Day today = Day.Sunday;
		day today = day.Monday;
		System.out.println("Today is "+today);

	}

}

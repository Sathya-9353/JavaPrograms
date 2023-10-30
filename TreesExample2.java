package collectionprograms;
import java.util.TreeSet;
class AutoMobiles implements Comparable<AutoMobiles> {
	    private String carname;
	    private String model;
	    private int Rcno;
	    private int year;

	    public AutoMobiles (String carname, String model,int Rcno, int year) {
	        this.carname = carname;
	        this.Rcno = Rcno;
	        this.model = model;
	        this.year = year;
	        
	    }

		public String getName() {
	        return carname;
	    }
		public int getRcno() {
			return Rcno;
		}
		public String getmodel() {
			return model;
		}
		public int getyear() {
			return year;
		}

		@Override
	    public int compareTo(AutoMobiles other) {
	        return this.carname.compareTo(other.carname);
	    }

		@Override
		public String toString() {
			return "AutoMobiles [carname=" + carname + ", Rcno=" + Rcno + ", model=" + model + ", year=" + year
					+ "]";
		}

}
public class TreesExample2 {
	public static void main(String[] args) {
		TreeSet<AutoMobiles> List = new TreeSet<>();
		List.add(new AutoMobiles("Toyato","Fortuner", 765827,2023));
		List.add(new AutoMobiles("Kia","Scltos",456373,2019));
		List.add(new AutoMobiles("MG","Hector",435262,2020));
		List.add(new AutoMobiles("Suzuki","Swift",56789, 2016));
		boolean isAdded = List.add(new AutoMobiles("Suzuki","Swift",56789, 2016));
		if (isAdded) {
			System.out.println("List added successfully.");
		}
		else 
		{
			System.out.println("List Toyato is already in the list.");
		}
		System.out.println("List (Sorted by Name):");
		for (AutoMobiles a : List) {
			System.out.println(a);
		}
	}
}


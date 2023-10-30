package collectionprograms;

import java.util.ArrayList;

class Product1 implements Comparable<Product1>{
	private String Skincareprod;
	private double Price;
	
	public Product1(String Skincareprod, double Price) {
		this.Skincareprod=Skincareprod;
		this.Price=Price;
	}
	public String getSkincareprod() {
		return Skincareprod;
	}
	public double getPrice() {
		return Price;
	}
	
	@Override
    public int compareTo(Product1 other) {
        return this.Skincareprod.compareTo(other.Skincareprod);
    }
	
	@Override
	public String toString() {
		return Skincareprod + " -$" + Price;
	}
}

public class TreesExample1 {

	public static void main(String[] args) {
		
		ArrayList<Product1> al1= new ArrayList<>();
		
		System.out.println("Skincare");
		al1.add(new Product1("Facewash", 399.00));
		al1.add(new Product1("Moisturizer", 209.00));
		al1.add(new Product1("SunScreen", 669.00));
//		al1.add(new Product("Serum", 750.00));
		
		boolean isAdded = al1.add(new Product1("Serum", 750.00));

        if (isAdded) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product is already in the list.");
        }

        // Print the sorted list of contacts
        System.out.println("Product List (Sorted by Name):");
        for (Product1 p : al1) {
            System.out.println(p);
	}
	}

}

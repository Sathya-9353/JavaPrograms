package Collectionprogram;

import java.util.ArrayList;

class Product{
	private String Haircare;
	private int count;
	private double price;
	
	//constuctor
	public Product(String Haircare, int count, double price) {
		this.Haircare=Haircare;
		this.count=count;
		this.price=price;
	}

	public Product(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public String getHaircare() {
		return Haircare;
	}

	public void setHaircare(String haircare) {
		Haircare = haircare;
	}

	public int getcount() {
		return count;
	}

	public void setcount(int count) {
		count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Salon [Haircare=" + Haircare + ", count=" + count + ", price=" + price + "]";
	}
	
}
class Product1{
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
	public String toString() {
		return Skincareprod + " -$" + Price;
	}
	
	
	
}

public class ArraylistShopping {

	public static void main(String[] args) {
		
		ArrayList<Product> al= new ArrayList<>();
		ArrayList<Product1> al1= new ArrayList<>();
		System.out.println("HAIRCARE");
		al.add(new Product("Shampoo", 1 , 299.00));
		al.add(new Product("Hairmask", 4, 999.00));
		al.add(new Product("Conditioner", 2, 599.00));
		al.add(new Product("Serum", 2, 750.00));
		
		System.out.println("Skincare");
		al1.add(new Product1("Facewash", 399.00));
		al1.add(new Product1("Moisturizer", 209.00));
		al1.add(new Product1("SunScreen", 669.00));
//		al1.add(new Product("Serum", 750.00));
		
		 System.out.println("Shopping Cart Contents:");
	        for (Product product : al) {
	            System.out.println(product);
	        }
		
		double totalCost = 0;
        for (Product product : al) {
            totalCost += product.getPrice();}
        
//        System.out.println("Total Cost: $" + totalCost);
        
        //product1
//        System.out.println("Shopping Cart Contents:");
        for (Product1 product1 : al1) {
            System.out.println(product1);
        }
	
	double totalCost1 = 0;
    for (Product1 product1 : al1) {
        totalCost1 += product1.getPrice();}
    
    System.out.println("Total Cost: $" + totalCost1+totalCost);

	}

}

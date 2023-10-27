package Collectionprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Books {
    int bookcode;
    String bookbrands, bookcolor;

    public int getbookcode() {
        return bookcode;
    }

    public void setbookcode(int bookcode) {
        this.bookcode = bookcode;
    }

    public String getbookbrands() {
        return bookbrands;
    }

    public void setbookbrands(String bookbrands) {
        this.bookbrands = bookbrands;
    }

    public String getbookcolor() {
        return bookcolor;
    }

    public void setbookcolor(String ldegree) {
        this.bookcolor = bookcolor;
    }

    public Books(int bookcode, String bookbrands, String bookcolor) {
        super();
        this.bookcode = bookcode;
        this.bookbrands = bookbrands;
        this.bookcolor = bookcolor;
    }

	@Override
	public String toString() {
		return "Books [bookcode=" + bookcode + ", bookbrands=" + bookbrands + ", bookcolor=" + bookcolor + "]";
	}

    
}

public class CollectionprogramExample1  {

    public static void main(String[] args) {

        ArrayList<Books> ob = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter bookcode ");
                    int bookcode = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.print("Enter bookbrands ");
                    String bookbrands = sc.nextLine();
                    System.out.print("Enter bookcolor ");
                    String bookcolor = sc.nextLine();
                    ob.add(new Books(bookcode, bookbrands, bookcolor));
                    break;

                case 2:
                    Iterator<Books> itr = ob.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter bookcode to Search: ");
                    int lno1 = sc.nextInt();

                    Iterator<Books> i = ob.iterator();
                    while (i.hasNext()) {
                        Books e = i.next();
                        if (e.getbookcode() == lno1) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("This kind of book is not available");
                    }
                    break;

                case 4:
                    System.out.println("Enter bookcode to delete");
                    int bookcodeDelete = sc.nextInt();
                    boolean isDeleted = false;

                    Iterator<Books> it = ob.iterator();
                    while (it.hasNext()) {
                        Books b = it.next();
                        if (b.getbookcode() == bookcodeDelete()) {
                            it.remove();
                            isDeleted = true;
                        }
                    }
                    if (isDeleted) {
                        System.out.println("Record has been deleted");
                    } else {
                        System.out.println("Sorry bookbrand not found, Deletion failed");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }

	private static int bookcodeDelete() {
		// TODO Auto-generated method stub
		return 0;
	}
}

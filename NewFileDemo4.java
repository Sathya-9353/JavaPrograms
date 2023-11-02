package Filesystemprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewFileDemo4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File ob = new File("File1.txt");
		Scanner sc = new Scanner(ob);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}

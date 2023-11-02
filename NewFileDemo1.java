package Filesystemprogram;

import java.io.File;
import java.io.IOException;

public class NewFileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File ob = new File("File2.txt");
		if(ob.createNewFile()) {
			System.out.println("File Created ");
		}
		else {
			System.out.println("File exsiting");
		}

	}

}

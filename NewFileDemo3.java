package Filesystemprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFileDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter ob= new FileWriter("File2.txt");
		ob.write(65);
		ob.write(66);
		ob.write(67);
//		ob.write("Java is object oriented Languages");
		System.out.println("Written is successful");
		ob.close();
	}

}

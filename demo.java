package Filesystemprogram;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

	

public class demo {

	public static void main(String[] args) {

		   Person ob = new Person("Bob", 8);
		   Person ob1=new Person("Devid",9);
		   int id=1;

	        // Serialization: Writing the object to a file
	        try {
	            FileOutputStream filein = new FileOutputStream("File3.txt");
	            ObjectOutputStream os= new ObjectOutputStream(filein);
	            os.writeObject(ob);
	            os.close();
	            filein.close();
	            System.out.println("Serialization successful. Object saved as ob.serialization");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	}

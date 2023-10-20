package BasicProgram;

	class sky 
	{  
	public void displayHuman()  
	{  
	System.out.println("Method defined inside HumanBody class");  
	}  
	}  
	interface blue  
	{  
	public void morning();  
	}  
	interface black  
	{  
	public void night();  
	}   
	public class Hybridinheritance extends sky implements blue, black {  
		@Override
		public void night() {
			System.out.println("Its prints black sky in Night");
			
		}
		@Override
		public void morning() {
			System.out.println("Its prints blue sky int Morning");
			
		}	 
	public static void main(String args[])  
	{  
	Hybridinheritance obj = new Hybridinheritance();  
	System.out.println("Implementation of Hybrid Inheritance in Java");  
	obj.night();  
	obj.morning();  
	} 
	}
	

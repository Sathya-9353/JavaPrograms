package String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//length
		String s="sathya";
		int str = s.length();
		System.out.println(str);
		
		//CharAt
		String str1="World";
		char str2=str1.charAt(4);
		System.out.println(str2);
		
		//Concatenate(string str)
		String a="EDU";
		String b = "BRIDGE";
		String c= a.concat(b);
		System.out.println(c);
		
		//equals(object o)
		//equalIgnoreCase()
		String st= "hello";
		String st1= "Hello";
		boolean rs= st.equals(st1);
		boolean Rs= st.equalsIgnoreCase(st1);
		System.out.println(Rs);
		
//		String st ="hello";
//		String st1="hello";
//		boolean st2= st==st1;      //==
//		System.out.println(st2);
//		
		//boolean rs=st.equals(st1);  //equals() 
		//System.out.println(rs);
		
		//toLowerCase
		String Name="SATHYA";
		String Lowercase= Name.toLowerCase();
		System.out.println(Lowercase);
		
		//toUppercase
		String Name1="sathya";
		String Uppercase= Name1.toUpperCase();
		System.out.println(Uppercase);
		
		//trim
		String s1="   Welcome";
		String s2=s1.trim();
		System.out.println(s2);

	}

}

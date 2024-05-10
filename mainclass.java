package com.si.student;
class NormalClass {
	
	int a =10; //instance variable
	static int b=20; //static variable
	
	
	//instance method
	String display() {
		return "Hello Display";
	}
	
	//static method
	public static String display1() {
		return "Hello static display";
	}

}

public class mainclass {		
		public static void main(String[] args) {
			
			NormalClass n1 = new  NormalClass(); // creating objects
			
			//Accessing instance members(variable+methods)
			
			System.out.println(n1.a); //accessing instance variable through objects
			n1.display(); //accessing instance method through objects
			
			
			System.out.println("**************************************");
			
			// Accessing static members(variable+methods)
			
			System.out.println(NormalClass.b); // Accessing static variable through class
			NormalClass.display1(); // By specifying classname.method() we can access static method.
			
		}

	}


//Parameterized Constructor example

package com.si.constructors;

public class MyClass_1 {
	    int number;
	    public MyClass_1(int x) {
	        System.out.println("Parameterized Constructor Called");
	        number=x;
	    }
	   
	    public static void main(String[] args) {
	        
	        MyClass_1 obj = new MyClass_1(4); // Parameterized Constructor Called
	        System.out.println("Number value is: "+obj.number);
	    }  
	}


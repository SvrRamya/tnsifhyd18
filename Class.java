package com.si.constructors;

public class Class {
	    int num1;
	    double num2;
	    //Default Constructor
	    public Class()
	    {
	        System.out.println("Default Constructor Called");
	        num1=1;
	        num2=1.5;
	    }
	    //Parameterized Constructor 1
	    public Class(int x) {   
	        System.out.println("Parameterized Constructor 1 Called");
	        num1=x;
	    }
	    //Parameterized Constructor 2
	    public Class(int x, double z) { 
	        System.out.println("Parameterized Constructor 2 Called");
	        num1=x;
	        num2=z;
	    }
	    void displayData()
	    {
	        System.out.println("Num1: "+num1+"\nNum2: "+num2);
	    }
	    public static void main(String[] args) {
	        
	        Class obj1 = new Class(); // Default Constructor Called
	        obj1.displayData();
	        Class obj2 = new Class(5); // Parameterized Constructor 1 Called
	        obj2.displayData();
	        Class obj3 = new Class(5,5.5); // Parameterized Constructor 2 Called
	        obj3.displayData();
	    }  
	}


package com.day3_1;

import java.util.Scanner;

public class Nested_if {
	public static void main(String[] args) {
		
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Number");
	int number=input.nextInt();  
      
       if (number > 0) {
           if (number % 2 == 0) {
               System.out.println("The number is positive and even.");
           } else {
               System.out.println("The number is positive and odd.");
           }
       }
       else {
    	   System.out.println("Negative number");
       }
   }

}

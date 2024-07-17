package com.day3_1;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=input.nextInt(); 
		String Name="Ramya";
		while( num<=5) {
			 System.out.println(num+" : My name is : "+Name);
	  num++;
		}
	}/*public static void main(String[] args) {  
	    int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
	} */ 
	

}

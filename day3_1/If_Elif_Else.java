package com.day3_1;

import java.util.Scanner;

public class If_Elif_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=input.nextInt();  
	      
	    if(num<0){  
	        System.out.println("Negative");  
	    }  
	    else if(num>0){  
	        System.out.println("Positive");  
	    }  
	    
	else{  
	        System.out.println("Neither Negative nor Positive");  
	    }  
	}  




}

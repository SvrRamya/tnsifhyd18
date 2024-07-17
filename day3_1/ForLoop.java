package com.day3_1;

import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=input.nextInt(); 
	String Name="Ramya";
      for(int i=0;i<num;i++) {
    	  System.out.println(i+" : My name is : "+Name);
      }
}
}

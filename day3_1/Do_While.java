package com.day3_1;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=input.nextInt(); 
		String Name="Ramya";
		do {
			  System.out.println(num+" : My name is : "+Name);
		num++;
		}while(num<10);
	}

}

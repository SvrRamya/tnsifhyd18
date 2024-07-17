package com.day3_1;

import java.util.Scanner;

public class If {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc= new Scanner(System.in);
	System.out.println("Enter age");
	int Age=sc.nextInt();
	
	
	if(Age>18) {
		System.out.println("Age is "+Age+" So eligible for voting");
	}
	
	
	}
}

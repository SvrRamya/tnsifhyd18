package com.day3_1;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int Age=sc.nextInt();
		if(Age>18) {
			System.out.println("Age is "+Age+" So eligible for voting");
		}
		else {
			System.out.println("Age is "+Age+" So not eligible for voting");
		}
		
	}
}

package com.day3;

public class CPolymorphism {
	public void Add(int a) {
		System.out.println("value : " + a);;
	}
	public void Add(int a,int b) {
		System.out.println("Value:"+(a+b));
	}
	public static void main(String[] args) {
		CPolymorphism c1=new CPolymorphism();
		c1.Add(5);
		c1.Add(10, 20);
		}

}

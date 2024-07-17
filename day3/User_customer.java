package com.day3;

public class User_customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dell d1=new Dell();
		d1.capture();
		d1.copy();
		d1.cut();
		d1.paste();
		d1.keyboard();
		d1.security();
		 
		System.out.println("*************");
		
		Lenovo l1=new Lenovo();
		l1.copy();
		l1.cut();
		l1.keyboard();
		l1.paste();
		l1.select();
		l1.security();
		Laptop.audio(); 
		System.out.println("**************");
		
		HP h1=new HP();
		h1.copy();
		h1.cut();
		h1.keyboard();
		h1.paste();
		h1.audio();
		
		Laptop.audio(); 
	}

}

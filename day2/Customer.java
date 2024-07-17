package com.day2;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo l1=new Lenovo();
		System.out.println(l1.copy());
		System.out.println(l1.cut());
		System.out.println(l1.keyborad());
		System.out.println(l1.paste());
		
		System.out.println("******************");
		
		Dell d1=new Dell();
		System.out.println(d1.paste());
		System.out.println(d1.capture());
		System.out.println(d1.copy());

	}

}

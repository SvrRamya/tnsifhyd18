package com.day3;

public class MultipleUser implements MultipleC{

	@Override
	public void C1properties() {
		// TODO Auto-generated method stub
		System.out.println("Child 1 properties");
	}

	@Override
	public void Pproperties() {
		// TODO Auto-generated method stub
		System.out.println("Parent properties");
	}

	@Override
	public void C2Properties() {
		// TODO Auto-generated method stub
		System.out.println("Child 2 properties");
	}
	public static void main(String[] args) {
		MultipleUser m1= new MultipleUser();
		System.out.println("HAi i am the child 2 ,I have ");
		m1.C2Properties();
		System.out.println(" As well as ");
		m1.Pproperties();
		System.out.println(" And");
		m1.C1properties();
		
	}

	
	
}

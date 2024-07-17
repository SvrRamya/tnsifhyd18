package com.day3;

public class SingleB extends SingleA {

	public void Cproperties() {
		System.out.println("Child properties");
	}
	public static void main(String[] args) {
	SingleB s=new SingleB();
	s.Fproperties();
	s.Cproperties();
		
	}
}


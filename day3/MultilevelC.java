package com.day3;

public class MultilevelC extends MultilevelB {
	void C2properties() {
		System.out.println("Child 2 properties");
	}
	public static void main(String[] args) {
		MultilevelC c1 = new MultilevelC();
		c1.C1properties();
		c1.C2properties();
		c1.Pproperties();
	}

}

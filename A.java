//Static method override not supported

package com.si.polymorphism;

class x{
	static void display() {
		System.out.println("Static class x content");
	}
}
class y extends x{
	static void diplay() {
		System.out.println("Static class y content");
	}
}
class z{
	public static void main(String[] args) {
		x.display();
		y.display();
	}
}
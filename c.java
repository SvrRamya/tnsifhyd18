//Instance method override

package com.si.polymorphism;
class A{
	void display() {
		System.out.println("Class A contains");
	}
}
class B extends A{
	void display() {
		System.out.println("Class B contains");
	}
}
public class c {
	public static void main(String[] args) {
		A a1 = new A();
		a1.display();
		A b1 = new B();// for class B object is created by A refernce 
		b1.display();//it override instance method
		
	}

}

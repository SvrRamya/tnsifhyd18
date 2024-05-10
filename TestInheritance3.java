//Java Hierarchical Inheritance Program Example –


package com.si.inheritance;
class Animals {
	 void eat() {
	  System.out.println("eating...");
	 }
	}
	class Dogs extends Animals {
	 void bark() {
	  System.out.println("barking...");
	 }
	}
	class Cat extends Animals {
	 void meow() {
	  System.out.println("meowing...");
	 }
	}
	class TestInheritance3 {
		 public static void main(String args[]) {
		  Cat c = new Cat();
		  c.meow();
		  c.eat();
		//c.bark();//C.T.Error  
		  Dogs d= new Dogs();
		  d.bark();
		  
		 }
		}
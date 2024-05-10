//Java Multilevel Inheritance Program Example –


package com.si.inheritance;

class forest {
	 void eat() {
	  System.out.println("eating...");
	 }
	}
	class donkey extends forest {
	 void bark() {
	  System.out.println("barking...");
	 }
	}
	class BabyDog extends donkey{
	 void weep() {
	  System.out.println("weeping...");
	 }
	}
	class TestInheritance2 {
		 public static void main(String args[]) {
		  BabyDog d = new BabyDog();
		  d.weep();
		  d.bark();
		  d.eat();
		 }
		}
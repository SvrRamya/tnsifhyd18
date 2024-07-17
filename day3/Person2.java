package com.day3;

public class Person2 extends Person1{
	@Override
	void Player(int age) {
		System.out.println("Person2 is a player an his age is:  "+ age);
	if(age>18) {
		System.out.println("Age is "+age+" So eligible for voting");
	}
	else {
		System.out.println("Age is "+age+" So not eligible for voting");
	}
	}
	@Override
	void student(String Name) {
		System.out.println("Person2 is average student and Name is : "+Name);
	}

}

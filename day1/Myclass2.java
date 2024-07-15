package com.day1;
class MyClass1
{
void display()
{
System.out.println("Hello World!");
}
}
public class Myclass2 {
	public static void main(String args[])
	{
	//accessing class MyClass1 from package p1
	MyClass1 obj = new MyClass1();
	obj.display();
	}
}

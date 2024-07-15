package com.day1;
class A
{
private void display()
{
System.out.println("TNS Sessions");
}
}
public class B {
	
	public static void main(String args[])
	{
	A obj = new A();
	//trying to access private method of another class
	obj.display();
	}
}

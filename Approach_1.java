package com.si.student;

public class Approach_1 {
	String batsman="Virat";//instance variable
	static String bowler="Dhoni";//static variable
	void display()//instance method
	{
		System.out.println("IPL 2k24");
	}
	static String display1()//static method
	{
		return "CRICKET";
	}
	public static void main(String[] args) {
		{
			Approach_1 a1=new Approach_1();//object creation
			System.out.println(a1.batsman);//instance variable calling by using object along with . operator 
			a1.display();//instance method calling by using object along with . operator 
			System.out.println(Approach_1.bowler);//static variable calling by using classname along with . operator 
			System.out.println(Approach_1.display1());//static method calling by using classname along with . operator 
		}
	}
}

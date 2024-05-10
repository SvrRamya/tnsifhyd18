package com.si.student;

 class Access {
	String batsman="Rohith";
	static String bowler="Sharma";
	void display()
	{
		System.out.println("IPL WINNER");
	}
	static String display1()
	{
		return "Best Captain";
	}

}
public class Approach_2{
	public static void main(String[] args) 
	{
		Access a2= new Access();
		System.out.println(a2.batsman);
		a2.display();
		System.out.println(Access.bowler);
		System.out.println(Access.display1());
	}
}
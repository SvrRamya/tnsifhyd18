package com.si.polymorphism;

public class Methodoverloading {
	
	double add(int x, double y)
	{
	return(x+y);
	}
	double add(double x, int y)
	{
	return(x+y);
	}
	double add(double x, int y, float z)
	{
	return(x+y+z);
	}
	public static void main(String[] args)
	{
	int a=5;
	double b = 7.5;
	float c = 4.5f;
	double result;
	Methodoverloading obj = new Methodoverloading();
	result = obj.add(a, b);
	System.out.println("Addtion is: "+result);
	result = obj.add(b, a);
	System.out.println("Addtion is: "+result);
	result = obj.add(b,a,c);
	System.out.println("Addtion is: "+result);
	}
	}


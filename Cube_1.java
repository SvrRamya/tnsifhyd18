//2. static Method


package com.si.package1;

public class Cube_1 {
	                     static int calculateCube(int side)
	                    {
	                        return (side*side*side);
	                    }
	public static void main(String[] args)
	{
	//System.out.println("Cube value of 5 is: "+calculateCube(5));
	System.out.println("Cube value of 5 is: "+Cube_1.calculateCube(5));
	}
	}

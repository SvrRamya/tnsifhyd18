//3. static Blocks in Java

package com.si.package1;

public class Cube_2 {
	static
	{
	System.out.println("static block is invoked");
	}
	static int calculateCube(int side)
	{
	return (side*side*side);
	}
	public static void main(String[] args) {
	//System.out.println("Cube value of 5 is: "+calculateCube(5));
	System.out.println("Cube value of 5 is: "+Cube_2.calculateCube(5));
	}


}

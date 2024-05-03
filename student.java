package com.si.sample;

public class student {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		int c=30;
		System.out.println(c);
		student s1=new student();
		System.out.println(s1.a);
		System.out.println(student.b);
	}

}

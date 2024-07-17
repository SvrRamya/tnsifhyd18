package com.day3;

public interface Laptop {
	public void copy();
	void paste();
	void cut();
	void keyboard();
	default void security(){
		commoncode();
		System.out.println("Laptop Security code");
		}
	static void audio() {
		commoncode();
		System.out.println("Laptop audio code");
	}
	private static void commoncode() {
		System.out.println("Common code");
	}
}

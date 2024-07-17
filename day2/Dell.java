package com.day2;

public class Dell implements Laptop{

	@Override
	public String copy() {
		// TODO Auto-generated method stub
		return "Copy code of Dell";
	}

	@Override
	public String paste() {
		// TODO Auto-generated method stub
		return "Paste code of Dell";
	}

	@Override
	public String cut() {
		// TODO Auto-generated method stub
		return "Cut code of Dell";
	}

	@Override
	public String keyborad() {
		// TODO Auto-generated method stub
		return "Keyboard code of Dell";
	}
    public String capture() {
    	return "Capture code of Dell";
    }
}

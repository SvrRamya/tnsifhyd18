package com.day3;

public class HierarchialMain {
public static void main(String[] args) {
	HierarchialA h1=new HierarchialA();
	h1.Pproperties();
	System.out.println("************************");
	HierarchialB h2=new HierarchialB();
	h2.Pproperties();
	h2.C1properties();
	System.out.println("************************");
	HierarchialC h3=new HierarchialC();
	h3.Pproperties();
	h3.C2properties();
	System.out.println("************************");
	HierarchialD h4=new HierarchialD();
	h4.Pproperties();
	h4.C3properties();
}
}

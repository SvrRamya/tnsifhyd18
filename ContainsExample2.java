////Java String contains() Method Example
package com.si.package1;

public class ContainsExample2 {
	public static void main(String[] args) {  
        String str = "Hello Javatpoint readers";  
        boolean isContains = str.contains("Javatpoint");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str.contains("JAVATPOINT")); // false  
    }  
	

}

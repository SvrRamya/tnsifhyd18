//Counting Frequency of a character in a String by Using the charAt() Method


package com.si.package1;

public class CharAtExample5 {
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint portal";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    }  


}

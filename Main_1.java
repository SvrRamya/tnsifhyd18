//Another example for default constructor
package com.si.constructors;
class car1default{//class
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
public car1default() { //constructor
	doors="Closed";
	engine="On";
	driver="Seated";
	speed=10;
	}
   public String run() { //method
		if(doors.equals("Closed")&&engine.equals("On")&&driver.equals("Seated")&&speed>0) {
			return "Car is Running....";
		   }
			else
			{
				return "Car is Not Running.....";
			}
	}
public class Main_1{ //Main class
		public static void main(String [] args) {
			car1default c1=new car1default();
			System.out.println(c1.run());
		}
		
	}
	
	
}

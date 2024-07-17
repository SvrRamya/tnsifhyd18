package com.day3;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(10);
	/*	s.isAttended=true;
		/*System.out.println("Teacher assigned attendence to student");
hear the code is repeated for n times for n students because in java when variables are declared then we didn't have any control on them*/
	/*if we use methods then we can have complete control on variables */
	s.setStudentAttendence(true);
	s.getStudentAttendence();
	s.setName("Ramya");
	System.out.println("Name  : "+s.getName());
	s.setRollno(10);
	System.out.println("RollNumber  : "+s.getRollno());
	s.setDepartment("CSE");
	System.out.println("Department  : "+s.getDepartment());
	}

}

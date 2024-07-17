package com.day3;

public class Student {
	private int Rollno;
	private String Name;
	private String Department;
	private boolean isAttended;
	public Student(int Rollno) {
		this.Rollno=Rollno;
	}
	public void setStudentAttendence(boolean flag) {
		
		isAttended=flag;
		if(flag==true) {
		System.out.println("Teacher assigned attendence to student");
		}
		else {
			System.out.println("Teacher not assigned attendence to student");
		}
	}
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence ");
		return isAttended;
		
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		this.Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		this.Department = department;
	}
	

}

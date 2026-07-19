package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	private String name;
	private int age;
	private String studentId;
	private List<String> courses;
	
	public Student(String name, int age, String studentId) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentId(studentId)) {
			this.name=name;
			this.age=age;
			this.studentId=studentId;
			courses=new ArrayList<String>();	
		}	
		else {
			
		}
	}
	
	public void enrollCourse(String course) {
		if(validateCourseName(course)) {
		if(!courses.contains(course)) {
			courses.add(course);
			System.out.println("Student is enrolled to "+ course +" successfully");
		}
		else {
			System.err.println("Student already enrolled in "+course+"!");
		}
		}
		
	}
	
	public void printStudentInfo() {
		System.out.println("=== Student Information ===");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("StudentId: "+studentId);
		System.out.println("Courses enrolled: "+courses);
	}
	
	public String toString()
	{
		return "Student[name="+name+", age="+age+", studentId="+studentId+",courses="+courses+"]";
	}

	public boolean validateAge(int age) {
		if(age>=18 && age<=35) {
			return true;
		}
		else
		{
			System.err.println("Enter valid age - between 19 and 35");
			return false;
		}
	}
	
	public boolean validateName(String name) {
		Pattern namePattern = Pattern.compile("^[a-zA-Z\\s]+$");
		Matcher verify = namePattern.matcher(name);
		
		if(verify.matches())
		{
			return true;
		}
		else
		{
			System.err.println("Enter valid name - Letters and spaces are allowed");
			return false;
		}
	}	
	
	public boolean validateStudentId(String studentId) {
		Pattern idPattern = Pattern.compile("S-\\d+$");
		Matcher verify = idPattern.matcher(studentId);
		if(verify.matches()) {
			return true;
		}
		else {
			System.err.println("Enter valid student id - Student id starts with S-Digits");
			return false;
		}
	}
	
	public boolean validateCourseName(String course) {
		if(course.equals("Java")||course.equals("DSA")||course.equals("DevOps"))
		{
			return true;
		}
		else {
			System.err.println("Please select courses from list - Java, DSA, DevOps");
			return false;
		}
	}
	
	//getter for name
	public String getName()
	{
		return name;
	}
	
	//getter for age
	public int getAge() {
		return age;
	}
	
	//getter for studentid
	public String getStudentId() {
		return studentId;
	}
	
	//getter for courses
	public List<String> getCourses(){
		return courses;
	}
}

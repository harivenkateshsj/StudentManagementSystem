package com.studentapp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** Student Management System ******");
		System.out.println("***Welcome***");
		Student s1 = new Student("Hari venkatesh",29,"S-1");
		s1.enrollCourse("Java");
		s1.enrollCourse("DSA");
		s1.enrollCourse("SpringBoot");
		System.out.println(s1);
		
		Student s2 = new Student("Ritu",22,"S-2");
		s2.enrollCourse("DSA");
		System.out.println(s2);
		
		Student s3 = new Student("Uday",23,"S-3");
		s3.enrollCourse("DevOps");
		System.out.println(s3);
		//s1.printInfo();
	}

}

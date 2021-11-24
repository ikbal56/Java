package com.technoelevate.programpractice;

public class Student {
	int sid;
	String name;
	double marks;
	int age;
	// Contractor
	public Student(int sid, String name, double marks, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	void studentDetails() {
		System.out.println("student id:" + sid);
		System.out.println("student name:" + name);
		System.out.println("student marks:" + marks);
		System.out.println("student age:" + age);

	}

	public static void main(String[] args) {
		Student s = new Student(331, "Ikbal Hossain", 60, 25);
		s.studentDetails();

	}

}

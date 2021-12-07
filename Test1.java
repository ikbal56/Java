package com.technoelevate.method;

class X {

}

class Employ {

}

class Y {

}

class Student {

}

public class Test1 {
	void m3(X x, Employ e) {
		System.out.println("m3 method");

	}

	static void m4(Y y, Student s) {
		System.out.println("m4 method");

	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		X x = new X();
		Employ e1 = new Employ();
		t.m3(x, e1);

		Y y = new Y();
		Student s = new Student();
		Test1.m4(y, s);
	}

}

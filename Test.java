package com.technoelevate.basic;

public class Test {
	int a = 10;
	int b = 30;
	static int d = 40;
	static int e = 50;

	void m1() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.d);
		System.out.println(Test.e);
	}

	static void m2() {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test.d);
		System.out.println(Test.e);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		Test.m2();

	}

}

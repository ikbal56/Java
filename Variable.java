package com.technoelevate.basic;

public class Variable {

	int a = 20;
	int b = 30;

	static void m1() {
		Variable v = new Variable();
		System.out.println(v.a);
		System.out.println(v.b);
	}

	static void m2() {
		Variable v = new Variable();
		System.out.println(v.a);
		System.out.println(v.b);
	}

	public static void main(String[] args) {
		Variable.m1();
		Variable.m2();
	}

}

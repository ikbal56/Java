package com.technoelevate.method;

public class Test2 {
	
	void m1(int a, char ch) {
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str,double d) {
		System.out.println("m2 method");
		System.out.println("str");
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m1(5,'R');
		Test2.m2("iku",11.19);
	}

}

package com.technoelevate.basic;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before swaping:" + a + " " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After swaping:" + a + " " + b);
	}

}

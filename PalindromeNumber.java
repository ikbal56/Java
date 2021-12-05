package com.technoelevate.programpractice;

public class PalindromeNumber {
	public static void main(String[] args) {

		int rem = 131;
		int temp = rem;
		int rev = 0;
		while (rem != 0) {

			rev = rev * 10 + rem % 10;
			rem = rem / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a palindrome ");
		} else {
			System.out.println(temp + " not a palindrome ");
		}
	}
}

package com.technoelevate.programpractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int m = 2;
		int n = 10;
		for (int i = m; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}

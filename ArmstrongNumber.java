package com.technoelevate.programpractice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=370;
		int rem=0;
		int res=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if(temp==res) {
			System.out.println(temp+ " is Armstrong Number");
		}
		else {
			System.out.println(temp+" not a Armstrong Number");
		}
	}

}

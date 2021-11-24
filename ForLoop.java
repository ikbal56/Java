package com.technoelevate.programpractice;

import java.util.Scanner;

public class ForLoop {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(" Enter 5 integer");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("My array contents are below elements");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
        boolean flag=true;
        while(flag) {
        	flag=false;
        	int temp=0;
        	for(int i=0;i<arr.length-1;i++) {
        		if(arr[i]<arr[i+1]);{
        			temp=arr[i];
        			arr[i]=arr[i+1];
        			arr[i+1]=temp;
        			flag=true;
        		}
        	}
        }
    
	}
	
		
	}



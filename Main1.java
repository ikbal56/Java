package com.technoelevate.programpractice;

import java.util.Scanner;

public class Main1 {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		while (quit) {
			System.out.println("Welcome to Shop");
			System.out.println("0: to print choice option");
			System.out.println("1:To print the list of grocery items");
			System.out.println("2:To add an item to the list");
			System.out.println("3:To modify the item to the list");
			System.out.println("4:To remove the item from the list");
			System.out.println("5:To quit the application");
		}
	}

	public static void addItem() {
		System.out.println("Please enter the grocery item");

		groceryList.addGroceryItem(sc.nextLine());

	}
}

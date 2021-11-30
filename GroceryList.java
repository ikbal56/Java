package com.technoelevate.programpractice;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<>();

	public void addGroceryItem(String item) {
		groceryList.add(item);

	}

	public void printGroceryList() {
		System.out.println("you have"+groceryList.size()+"item in your list");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println();
		}
	}
	
	public void modifyGrocerylist(int position,String newitem) {
		groceryList.set(position, newitem);
		System.out.println("Grocery item"+(position+1)+"has been modified");
	}
	
	  public void removeGroceryItem(int position) {
		  String theItem=groceryList.get(position);
		  groceryList.remove(position);
	  }
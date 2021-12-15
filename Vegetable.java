package com.technoelevate.comparable;

public class Vegetable implements Comparable<Vegetable>{
	
	private String vName;
	private double price;
	private int quantity;
	
	
	public Vegetable(String vName, double price, int quantity) {
	
		this.vName = vName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public String getvName() {
		return vName;
	}

	public double getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}

	@Override
	public int compareTo(Vegetable o) {
		if (this.price==o.price) {
			return 0;
		}
		else if(this.price<=o.price) {
			return -1;
		}
		else {
		
		return 1 ;
	}

	}


	@Override
	public String toString() {
		return "Vegetable [vName=" + vName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}

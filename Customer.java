package com.technoelevate.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Customer {

	private static ArrayList<Vegetable> ar = new ArrayList<>();

	public static void main(String[] args) {

		Vegetable veg = new Vegetable("Carrot", 120, 2);
		Vegetable veg2 = new Vegetable("Beet", 70, 3);
		Vegetable veg3 = new Vegetable("Cabbage", 110, 4);
		Vegetable veg4 = new Vegetable("Green bean", 200, 1);
		Vegetable veg5 = new Vegetable("Sweet Potato", 50, 2);

		ar.add(veg);
		ar.add(veg2);
		ar.add(veg3);
		ar.add(veg4);
		ar.add(veg5);

		Collections.sort(ar);

		for (Vegetable ve : ar) {
			System.out.println(ve);
		}

	}

}

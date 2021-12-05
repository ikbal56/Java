package com.technoelevate.programpractice;

public class Main {
	static ArrayImplements  list = new ArrayImplements(2);

	public static void main(String[] args) {

		list.addElement("Sameer");
		list.addElement("Sachin");
		list.addElement("Iku");
		list.addElement("Rajjak");
		System.out.println(list.size());
		list.addElement("Ikbal");
		list.addElement("Hossain");
		list.addElement("Ikbal");
		list.addElement("Arip");
		list.addElement("Rihab");
		
		System.out.println(list.size());

		System.out.println(list.getElement(6));
		list.getAllElements();

	}

}

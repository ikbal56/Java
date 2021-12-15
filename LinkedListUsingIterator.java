package com.technoelevate.programpractice;

import java.util.Iterator;

public class LinkedListUsingIterator {
   static LinkedList l=new LinkedList();
   public static void main(String[] args) {
	LinkedList l1=new LinkedList("SIET","IBP","TP");
	LinkedList l2=new LinkedList("SIET","Dilsukhnagar","KP");
	LinkedList l3=new LinkedList("SIET","KOTI","AP");
	l.add(15);
	l.add(22);
	l.add(19);
	getElements();
}
   public static void getElements() {
	   Iterator itr=l.iterator();
	   while(itr.hasNext()) {
		   LinkedList j=(LinkedList)itr.next();
		   System.out.println("The college is"+j.getCollege()+"And"+j.getArea()+"is the Area Branch is"+j.getBranch());
	   }
   }
}

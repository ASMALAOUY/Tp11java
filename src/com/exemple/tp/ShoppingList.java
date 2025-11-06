package com.exemple.tp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	private final List<String> items=new ArrayList<>();
	
	public void add(String item) {
		items.add(item);
		System.out.println(" ' " +item+ " 'ajoute.");
	}
	public boolean remove(String item) {
		boolean ok=items.remove(item);
		if(ok) {
		System.out.println("'"+item+"'supprime");
		}else {
			System.out.println("'"+item+"'introuvable");
		}
		return ok;
	}
	
	public boolean contains(String item) {
		boolean present=items.contains(item);
		if (present) {
		   System.out.println("'"+item+"'est dans la list");
			
		}else {
			System.out.println("'"+item+"'n'est pas dans la list");
		}
		return present;
		
	}
	public void display() {
		System.out.println("\n Vote liste de courses :");
		if (items.isEmpty()) {
			System.out.println("(vide)");
		}else {
			for(int i=0;i<items.size();i++) {
				System.out.printf("%2d. %s%n",i+1,items.get(i));
			}
		}
	}

}

package com.exemple.tp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 ShoppingList list = new ShoppingList();
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Gestion de la liste des courses");
		 
		 while (true) {
			 System.out.println("\n Commande : add ,remove ,find,exit show");
		System.out.println("Entrez une commande : ");
		String cmd =sc.nextLine().trim().toLowerCase();
		 
		switch(cmd) {
		case"add":
			System.out.println("Article a ajouter :");
		    list.add(sc.nextLine().trim());
		    break;
		case "remove":
			System.out.println("Article a supprimer :");
		    list.remove(sc.nextLine().trim());
		    break;
		case "find":
			System.out.println("Article a rechercher :");
			list.contains(sc.nextLine().trim());
			break;
		case "show":
			list.display();
			break;
		case "exit":
			System.out.println("Au revoir !");
			sc.close();
			return ;
		default:
			System.out.println("Commande inconuue . ");
		}
		 }
		 
	}

}

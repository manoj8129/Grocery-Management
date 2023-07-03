package org.example.domain;

import java.util.Scanner;
public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		
		menuList();
		
		while(!quit) {
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 0: menuList();
				break;
			case 1: groceryList.printGroceryList();
				break;
			case 2: addItem();
				break;
			case 3: modifyItem();
				break;
			case 4: removeItem();
				break;
			case 5: searchForItem();
				break;
			case 6: quit = true;
				break;
			}
		}
	}
	public static void menuList() {
		System.out.println(" press");
		 System.out.println(" 0 . To print choice options.");
		 System.out.println(" 1 . To print the grocery list.");
         System.out.println(" 2 . To add an item to the list.");  
         System.out.println(" 3 . To modify an item in the list.");
         System.out.println(" 4 . To remove an item from the list.");
         System.out.println(" 5 . To search for an item in the list.");
         System.out.println(" 6 . Exit.");
         
	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(sc.nextLine());
		}
	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNum = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = sc.nextLine();
		groceryList.modifyGroceryItem(itemNum, newItem);
    }
	
	public static void removeItem() {
		System.out.println("Enter item number: ");
		int itemNum = sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceryItem(itemNum);
		
	}
	
	public static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchItem = sc.nextLine();
		
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found "+searchItem+" in grocery list");
			
		}
		else {
			System.out.println(searchItem+" is not in grocery list");
		}
	}

}

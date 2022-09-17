package com.te.truyum.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.te.truyum.model.MenuItem;

public class MenuItemDaoCollectionImplTest  {
	
	public static void testGetMenuItemListAdmin(){
		
		MenuItemDao menuItemDao=new MenuItemDaoCollectionImpl();
		 List<MenuItem> menuItemListForAdmin =menuItemDao.getMenuItemListAdmin();
		 for (MenuItem menuItem : menuItemListForAdmin) {
			System.out.println(menuItem);
		}
	} 
	public static void main(String[] args) {
		System.err.format("%-10s %-20s %-10s %-10s %-15s %-15s %-20s","ID","NAME","PRICE","ACTIVE","DATE OF LAUNCH","CATEGORY","FREEDELIVERY");
		System.out.println();
		System.out.println("********************************************* for admin **************************************************");
		testGetMenuItemListAdmin();
		System.out.println();
		System.out.println("*********************************************for customer**************************************************");
		testGetMenuItemListCustomer();
		
		
	}
	
	public static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl collectionImpl=new MenuItemDaoCollectionImpl();
		List<MenuItem> menuListCustomer = collectionImpl.getMenuItemListCustomer();
		for (MenuItem menuItem : menuListCustomer) {
					System.out.println(menuItem);
		}
	
	}
	public void testModifyMenuItem() {
		
	}
	public void testGetMenuItem() {
		
	}
	
}

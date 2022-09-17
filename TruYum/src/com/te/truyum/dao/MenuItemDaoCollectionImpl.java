package com.te.truyum.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.te.truyum.model.MenuItem;

public class MenuItemDaoCollectionImpl implements MenuItemDao{

	private static List<MenuItem> menuItemList;
	 
	public MenuItemDaoCollectionImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		menuItemList = new ArrayList<MenuItem>();
		menuItemList.add(new MenuItem(100l, "Sandwich", 150.0f, true,LocalDate.parse("2022-09-08"), "Main Course", true));
		menuItemList.add(new MenuItem(101l, "Burger", 250.0f, true,LocalDate.parse("2022-08-07"), "Main Course", true));
		menuItemList.add(new MenuItem(102l, "Pizza", 450.0f, true,LocalDate.parse("2022-08-07"), "Main Course", false));
		menuItemList.add(new MenuItem(103l, "French Fires", 120.0f, true,LocalDate.parse("2022-08-07"), "Starters", true));
		menuItemList.add(new MenuItem(104l, "Brownie", 120.0f, false,LocalDate.parse("2022-08-07"), "Desserts", true));
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		List<MenuItem> list = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			if(menuItem.getActive()==true) {
				if(menuItem.getDateOfLaunch().isBefore(LocalDate.now())||menuItem.getDateOfLaunch().equals(LocalDate.now()))
					list.add(menuItem);
			}
		}
		return list;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MenuItem getMenuItem(Long menuItemId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

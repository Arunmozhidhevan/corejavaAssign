package com.te.truyum.dao;

import java.util.List;

import com.te.truyum.model.MenuItem;

public interface MenuItemDao {

	List<MenuItem> getMenuItemListAdmin();

	List<MenuItem> getMenuItemListCustomer();

	void modifyMenuItem(MenuItem menuItem);

	MenuItem getMenuItem(Long menuItemId);

}

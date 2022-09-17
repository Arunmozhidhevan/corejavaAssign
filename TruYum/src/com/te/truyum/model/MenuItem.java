package com.te.truyum.model;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
	private Long id;
	private String name;
	private Float price;
	private Boolean active;
	private LocalDate dateOfLaunch;
	private String category;
	private Boolean freeDelivery;
	
	public MenuItem(Long id, String name, Float price, Boolean active, LocalDate dateOfLaunch, String category,
			Boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDate getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(LocalDate dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(Boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-20s %-10s %-10s %-15s %-15s %-20s",id,name,price,active,dateOfLaunch,category,freeDelivery);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}

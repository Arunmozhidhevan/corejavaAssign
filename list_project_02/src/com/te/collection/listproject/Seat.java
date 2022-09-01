package com.te.collection.listproject;

import java.util.ArrayList;
import java.util.List;

public class Seat implements Comparable<Seat>{

	private Integer seatNo;
	private String type;
	private Double price;
	private String passengerName;
	private String gender;
	
	public Seat() {
		super();
	}

	public Seat(Integer seatNo, String type, Double price, String passengerName, String gender) {
		super();
		this.seatNo = seatNo;
		this.type = type;
		this.price = price;
		this.passengerName = passengerName;
		this.gender = gender;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Seat [seatNo=" + seatNo + ", type=" + type + ", price=" + price + ", passengerName=" + passengerName
				+ ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Seat o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Seat createSeat(String detail) {
		
		
		String [] arr=detail.split(",");
		
		return new Seat(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), arr[3], arr[4]);
		
	}
	

	
	
	
	
	
}

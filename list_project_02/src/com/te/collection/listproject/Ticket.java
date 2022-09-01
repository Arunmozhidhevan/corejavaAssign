package com.te.collection.listproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Ticket {
	
	private String refld;
	private Date dateOfJourney;
	private List<Seat> seatList;
	
	public Ticket() {
		super();
	}

	public Ticket(String refld, Date dateOfJourney, List seatList) {
		super();
		this.refld = refld;
		this.dateOfJourney = dateOfJourney;
		if(seatList.isEmpty())
			this.seatList = seatList;
			
	}

	public String getRefld() {
		return refld;
	}

	public void setRefld(String refld) {
		this.refld = refld;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public List getSeatList() {
		return seatList;
	}

	public void setSeatList(List seatList) {
		this.seatList = seatList;
	}
	//LinkedList<E> l = new Lin
	
	public void addSeatToTicket(Seat seat) {
		 seatList = new ArrayList();
		seatList.add(seat);
	}
	
	public Boolean removeSeatFromTicket(Integer seatNo) {
		Boolean result=false;
		for (int i = 0; i <seatList.size(); i++) {
			if(seatNo==seatList.get(i).getSeatNo()) {
				seatList.remove(i);
			result=true;
		}
		
		else
			result=false;
		}
		return result;
	}
	public void displaySeat() {
		if(seatList.isEmpty()) {
			System.out.println("No Seats To Show");
		}
		else
			for (Seat seat : seatList) {
				System.out.println("Seats in [ticket refld]"+seat);

			}
				}

}

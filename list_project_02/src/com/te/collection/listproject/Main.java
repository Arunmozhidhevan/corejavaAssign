package com.te.collection.listproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("create  a seat");
		Scanner scanner = new Scanner(System.in);
		Seat seat = Seat.createSeat(scanner.next());
		System.out.println("Select your option :\n 1.Add Seat\n 2.Delete Seat\n 3.Display Seat\n 4.Exit");
		int option  = scanner.nextInt();
		
		Ticket ticket =  new Ticket();
		while(option>0) {
			
		switch (option) {
		case 1:

			System.out.println("Enter the seat details");
		
			//System.out.println(seat);
			ticket.addSeatToTicket(seat);
			System.out.println("Seat added successfully");
			System.out.println("Select your option :\n 1.Add Seat\n 2.Delete Seat\n 3.Display Seat\n 4.Exit");
			option  = scanner.nextInt();
			break;
		case 2:
			System.out.println("select a seat to delete:");
			ticket.removeSeatFromTicket(scanner.nextInt());
			System.out.println("Select your option :\n 1.Add Seat\n 2.Delete Seat\n 3.Display Seat\n 4.Exit");
			System.out.println("seat successfully deleted");
			option  = scanner.nextInt();
			
			break;
		case 3:
			ticket.displaySeat();
			System.out.println("Select your option :\n 1.Add Seat\n 2.Delete Seat\n 3.Display Seat\n 4.Exit");
			option  = scanner.nextInt();
			break;
		case 4:
			System.out.println("Select your option :\n 1.Add Seat\n 2.Delete Seat\n 3.Display Seat\n 4.Exit");
			System.out.println("Thank you");
			option =0;
			break;
		default:
			System.out.println(" choose only the options from above list");
			option=0;
			break;
		}
		
		}
		
	}
}

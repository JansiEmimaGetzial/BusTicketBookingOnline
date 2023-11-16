package com.cg;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.bean.BookingBean;
import com.cg.service.BusService;
import com.cg.service.BusServiceImpl;

public class BusClient {
	private BusService busService;

	public BusClient() {
		busService = new BusServiceImpl();
		int option = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			option = getChoice(scan);
			switch (option) {
			case 1:
				System.out.println("Book Ticket");
				BookingBean book;
				System.out.println("Enter <CUSTOMER ID> <BUS ID> <NUMBER OF SEATS>");
				book = new BookingBean(scan.next(), scan.nextInt(), scan.nextInt());
				boolean success = busService.bookticket();
				if (success) {
					System.out.println("Thankyou! Your Booking ID is ");
				} else {
					System.out.println("Sorry Seats Not Available");
				}
				break;
				
			
			case 2:
				System.out.println("Exiting system. Thank you.");
				scan.close();
				System.exit(0);
				break;

			default:
				System.out.println("Please enter number 1 and 2 only");
				break;
			}
		}
	}
	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("1. Book Ticket");
		System.out.println("2. Exit ");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please enter numbers only");
			scan.nextLine(); // consume the wrong value in keyboard memory
		}
	
	return choice;
	}

	public static void main(String[] args) {
	new BusClient();
	}
		

	}


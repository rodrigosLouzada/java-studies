package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramPesonaliExc {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("room number:");
		int number = scanner.nextInt();
		
		System.out.println("check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf1.parse(scanner.next());
		
		System.out.println("check-in date (dd/MM/yyyy): ");
		Date checkout = sdf1.parse(scanner.next());
		
		
		if(!checkout.after(checkIn)) {
			System.out.println("error in reservation, check ou must be after");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkout);
			System.out.println("reservation: " + reservation);
		
			System.out.println("enter data to update the reservastion");
		
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkIn = sdf1.parse(scanner.next());
			
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkout = sdf1.parse(scanner.next());
			
			
			Date now = new Date();
			if(checkIn.before(now) || checkout.before(now)) {
				System.out.println("error , dates must be in the futre");
			}else if (!checkout.after(checkIn)) {
				System.out.println("error in reservation, check ou must be after");

			}
			else {
				reservation.updateDates(checkIn, checkout);
				System.out.println("reservation: " + reservation);
			}

		}
		
		scanner.close();
	}

}

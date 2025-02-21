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
		Date checkOut = sdf1.parse(scanner.next());
		
		
		if(!checkOut.after(checkIn)) {
			System.out.println("error in reservation, check ou must be after");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("reservation: " + reservation);
		
			System.out.println("enter data to update the reservastion");
		
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkIn = sdf1.parse(scanner.next());
			
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkOut = sdf1.parse(scanner.next());
			
			
			String error = reservation.updateDates(checkIn, checkOut);
			
			if(error != null) {
				System.out.println("ERROR in reservation" + error);
			}else {
				System.out.println("reservation: " + reservation);

			}
		}
		
		scanner.close();
	}

}

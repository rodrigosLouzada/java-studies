package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramPersonalExc2 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("room number:");
			int number = scanner.nextInt();
			
			System.out.println("check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf1.parse(scanner.next());
			
			System.out.println("check-in date (dd/MM/yyyy): ");
			Date checkOut = sdf1.parse(scanner.next());
			
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("reservation: " + reservation);
		
			System.out.println("enter data to update the reservastion");
		
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkIn = sdf1.parse(scanner.next());
			
			System.out.println("check-in date (dd/MM/yyyy): ");
			checkOut = sdf1.parse(scanner.next());
			
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("reservation: " + reservation);
			
		}catch (ParseException e) {
			System.out.println("invalid date format");
		}
		catch (DomainException e) {
			System.out.println("error in reservation: " + e.getMessage());
		}catch (RuntimeException e) {
			System.out.println(" unexpected error");
		}

		scanner.close();
	}
}

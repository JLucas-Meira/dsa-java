package java_core.exceptions.custom.reservation_hotel.application;

import java_core.exceptions.custom.reservation_hotel.model.entities.Reservation;
import java_core.exceptions.custom.reservation_hotel.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date updCheckIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date updCheckOut = sdf.parse(sc.next());
            reservation.updateDates(updCheckIn, updCheckOut);
        }
        catch (ParseException e){
            System.err.println(e.getMessage());
        }
        catch (DomainException e) {
            System.err.println(e.getMessage());
        }
    }
}

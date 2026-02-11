package java_core.interfaces.locadora.service;

import java_core.interfaces.locadora.model.entities.CarRental;
import java_core.interfaces.locadora.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}

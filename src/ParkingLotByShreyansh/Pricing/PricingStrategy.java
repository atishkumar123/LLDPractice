package ParkingLotByShreyansh.Pricing;

import ParkingLotByShreyansh.ticket.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

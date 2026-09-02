package ParkingLotByShreyansh.Pricing;

import ParkingLotByShreyansh.ticket.Ticket;

public class FixedPriceStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}

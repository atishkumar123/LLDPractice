package ParkingLotByShreyansh.payment;

public class Cashpayment implements PaymentStrategy{
    @Override
    public boolean pay(double amount) {
        System.out.println("Cash Paid: "+ amount);
        return true;
    }
}

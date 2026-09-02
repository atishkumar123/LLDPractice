package ParkingLotByShreyansh.payment;

public class UpiPayment implements PaymentStrategy{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Completed By upi Payment");
        return true;
    }
}

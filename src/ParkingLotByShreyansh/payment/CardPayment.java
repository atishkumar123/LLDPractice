package ParkingLotByShreyansh.payment;

public class CardPayment implements PaymentStrategy{
    @Override
    public boolean pay(double amount) {

        System.out.println("Card payment done!"+ amount);
        return true;
    }
}

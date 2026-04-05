package ObserverDesignPattern.Obsever;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String  emailId,StockObservable stockObservable){
        this.emailId=emailId;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
         sendEmail(emailId,"Stock is now Available");

    }

    public void sendEmail(String emailId,String msg){
        System.out.println("mail sent to:"+emailId+" "+msg);
    }
}

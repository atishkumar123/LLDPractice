package ObserverDesignPattern.Obsever;

import ObserverDesignPattern.Observable.StockObservable;
import org.w3c.dom.ls.LSOutput;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String mobileNo;
    StockObservable stockObservable;
    public MobileAlertObserverImpl(String mobileNo, StockObservable stockObservable){
        this.stockObservable=stockObservable;
        this.mobileNo=mobileNo;
    }

    @Override
    public void update() {
       int stockCount= stockObservable.getStockCount();
        sendMsgOnMobile(mobileNo,"product is in stock hurry up!");
    }

    public void sendMsgOnMobile(String mobileNo,String msg){
        System.out.println("message sent to:"+mobileNo);
    }
}

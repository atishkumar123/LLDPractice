package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Obsever.EmailAlertObserverImpl;
import ObserverDesignPattern.Obsever.MobileAlertObserverImpl;
import ObserverDesignPattern.Obsever.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {


        StockObservable iphoneStockObservable =new IphoneObservableImpl();
        NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("XYZ@gmail",iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("7091848054",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);


        iphoneStockObservable.setStockCount(10);


    }
}

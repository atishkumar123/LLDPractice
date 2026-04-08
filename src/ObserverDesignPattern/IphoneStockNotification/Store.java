package ObserverDesignPattern.IphoneStockNotification;

import ObserverDesignPattern.IphoneStockNotification.Observable.IphoneObservableImpl;
import ObserverDesignPattern.IphoneStockNotification.Observable.StockObservable;
import ObserverDesignPattern.IphoneStockNotification.Obsever.EmailAlertObserverImpl;
import ObserverDesignPattern.IphoneStockNotification.Obsever.MobileAlertObserverImpl;
import ObserverDesignPattern.IphoneStockNotification.Obsever.NotificationAlertObserver;

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

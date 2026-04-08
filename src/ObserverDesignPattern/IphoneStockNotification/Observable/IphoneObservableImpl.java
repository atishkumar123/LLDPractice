package ObserverDesignPattern.IphoneStockNotification.Observable;

import ObserverDesignPattern.IphoneStockNotification.Obsever.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    int currentStockCount;

    @Override
    public void add(NotificationAlertObserver observer) {

        observerList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {

        if(currentStockCount==0){
            notifySubscribers();
        }

        currentStockCount+=newStockAdded;

    }

    @Override
    public int getStockCount() {
        return currentStockCount;
    }
}

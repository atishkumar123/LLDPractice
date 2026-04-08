package ObserverDesignPattern.WhetherStationNotification.Observable;

import ObserverDesignPattern.WhetherStationNotification.Observer.Display;

public interface WhetherStation {


    void registerObserver(Display display);

    void removeObserver(Display display);

    void notifyObserver();

}


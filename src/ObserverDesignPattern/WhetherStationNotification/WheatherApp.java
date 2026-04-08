package ObserverDesignPattern.WhetherStationNotification;

import ObserverDesignPattern.WhetherStationNotification.Observable.WhetherStation;
import ObserverDesignPattern.WhetherStationNotification.Observable.WhetherStationImpl;
import ObserverDesignPattern.WhetherStationNotification.Observer.Display;
import ObserverDesignPattern.WhetherStationNotification.Observer.MobileDisplay;
import ObserverDesignPattern.WhetherStationNotification.Observer.TVDisplay;

public class WheatherApp {
    public static void main(String[] args) {
        WhetherStationImpl station=new WhetherStationImpl();
        MobileDisplay mobileDisplay=new MobileDisplay("samsungMobile");
        TVDisplay tvDisplay=new TVDisplay("samsungTvDisplay");
        station.registerObserver(mobileDisplay);
        station.setTemp("34");
    }
}

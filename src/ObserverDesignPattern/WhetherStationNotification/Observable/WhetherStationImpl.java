package ObserverDesignPattern.WhetherStationNotification.Observable;

import ObserverDesignPattern.WhetherStationNotification.Observer.Display;

import java.util.ArrayList;
import java.util.List;

public class WhetherStationImpl implements WhetherStation{


    List<Display> displays=new ArrayList<>();

    String temp;

    @Override
    public void registerObserver(Display display) {
        displays.add(display);
    }

    @Override
    public void removeObserver(Display display) {
        displays.remove(display);
    }

    @Override
    public void notifyObserver() {

        for(Display display:displays){

            display.Update( temp);

        }

    }
    //set temp

    public void setTemp(String temp){
        this.temp=temp;
        notifyObserver();
    }
}

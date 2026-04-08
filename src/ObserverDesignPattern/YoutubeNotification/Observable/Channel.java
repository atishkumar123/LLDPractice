package ObserverDesignPattern.YoutubeNotification.Observable;

import ObserverDesignPattern.YoutubeNotification.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel implements YoutubeChannel{

    List<Subscriber> subscribers=new ArrayList<>();

    String channelName;
    String tittle;

    public Channel(String channelName){
        this.channelName=channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
         subscribers.add(subscriber);
    }

    @Override
    public void notifysubscribe() {

        for(Subscriber s:subscribers){
            s.update(channelName,tittle);
        }
    }

    //Upload Video
    public  void uploadVideo(String tittle){
        this.tittle=tittle;
        System.out.println("\n"+channelName + "uploaded:"+ tittle);
        notifysubscribe();

     }

}

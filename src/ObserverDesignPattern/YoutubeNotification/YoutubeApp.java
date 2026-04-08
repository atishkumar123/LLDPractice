package ObserverDesignPattern.YoutubeNotification;

import ObserverDesignPattern.YoutubeNotification.Observable.YoutubeChannel;
import ObserverDesignPattern.YoutubeNotification.Observable.Channel;
import ObserverDesignPattern.YoutubeNotification.Observer.Subscriber;
import ObserverDesignPattern.YoutubeNotification.Observer.User;

public class YoutubeApp {


    public static void main(String[] args) {
        Channel channel=new Channel("codeWithAtish");

        Subscriber s1=new User("Atish");
        Subscriber s2=new User("Arunabha");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("coding1");


    }







}

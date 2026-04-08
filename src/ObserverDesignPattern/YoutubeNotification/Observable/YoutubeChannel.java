package ObserverDesignPattern.YoutubeNotification.Observable;

import ObserverDesignPattern.YoutubeNotification.Observer.Subscriber;

public interface YoutubeChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifysubscribe();

}

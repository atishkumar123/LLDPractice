package ObserverDesignPattern.YoutubeNotification.Observer;

public interface Subscriber {

    void update(String channelName,String Title);
}

package ObserverDesignPattern.YoutubeNotification.Observer;

public class User implements Subscriber{

    String name;

    public User(String name){
        this.name=name;
    }


    @Override
    public void update(String channelName, String title) {
        System.out.println(name+" got notification from " + channelName +":"+title );


    }
}

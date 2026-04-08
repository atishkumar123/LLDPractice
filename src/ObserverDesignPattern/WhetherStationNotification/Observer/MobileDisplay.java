package ObserverDesignPattern.WhetherStationNotification.Observer;

public class MobileDisplay implements Display{
    String name;
    public MobileDisplay(String name){
        this.name=name;
    }
    @Override
    public void Update(String temp) {
        System.out.println("Temperature  on "+ name+ " is "+ temp);
    }



}

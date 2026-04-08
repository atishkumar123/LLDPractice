package ObserverDesignPattern.WhetherStationNotification.Observer;

public class TVDisplay implements Display{
    String name;

    public TVDisplay(String name){
        this.name=name;
    }
    @Override
    public void Update(String temp) {
        System.out.println("Temperature  on"+ name+ " is "+ temp);
    }
}

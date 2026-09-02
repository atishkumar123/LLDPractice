package SingletonDesignPattern;

public class Singleton {

    public Singleton(){
        System.out.println("Singleton Constructor called. New Object created");
    }


    public static void main(String[] args) {
        Singleton s1=new Singleton();
        Singleton s2=new Singleton();

        System.out.println(s1==s2);
    }


}

package FactoryPattern.AbstractFactory.GarlicBread;

public class CheeseGarlicBread  implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("It is  CheeseGarlicBread");
    }
}

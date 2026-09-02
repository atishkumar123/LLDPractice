package FactoryPattern.AbstractFactory.GarlicBread;

public class CheeseWheatGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("It is Cheese WheatGarlicBread");
    }
}

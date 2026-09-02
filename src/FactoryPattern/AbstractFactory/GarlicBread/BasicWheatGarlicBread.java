package FactoryPattern.AbstractFactory.GarlicBread;

public class BasicWheatGarlicBread  implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("It is BasicWheatGarlicBread Burger");
    }
}

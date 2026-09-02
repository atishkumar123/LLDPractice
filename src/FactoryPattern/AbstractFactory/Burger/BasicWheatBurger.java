package FactoryPattern.AbstractFactory.Burger;

public class BasicWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("It is Basic Wheat Burger");
    }
}

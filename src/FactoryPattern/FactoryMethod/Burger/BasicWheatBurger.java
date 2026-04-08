package FactoryPattern.FactoryMethod.Burger;

public class BasicWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("It is BasicWheat Burger");
    }
}

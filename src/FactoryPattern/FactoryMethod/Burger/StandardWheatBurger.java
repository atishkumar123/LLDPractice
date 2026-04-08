package FactoryPattern.FactoryMethod.Burger;

public class StandardWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("It is StandardWheat Burger");
    }
}

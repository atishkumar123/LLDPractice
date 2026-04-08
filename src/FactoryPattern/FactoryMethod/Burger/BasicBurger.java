package FactoryPattern.FactoryMethod.Burger;

public class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("It is Basic Burger");
    }
}

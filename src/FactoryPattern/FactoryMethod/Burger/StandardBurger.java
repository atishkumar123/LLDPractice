package FactoryPattern.FactoryMethod.Burger;

public class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("It is Standard Burger");
    }
}

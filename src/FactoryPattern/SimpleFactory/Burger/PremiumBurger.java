package FactoryPattern.SimpleFactory.Burger;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("It is Premium Burger");
    }
}

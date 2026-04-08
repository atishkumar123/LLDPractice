package FactoryPattern.FactoryMethod.Burger;

public class PremiumWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("It is PremiumWheat Burger");
    }
}

package FactoryPattern.FactoryMethod.BurgerFactory;

import FactoryPattern.FactoryMethod.Burger.BasicBurger;
import FactoryPattern.FactoryMethod.Burger.Burger;
import FactoryPattern.FactoryMethod.Burger.PremiumBurger;
import FactoryPattern.FactoryMethod.Burger.StandardBurger;

public class SinghBurger implements BurgerFactory{
    @Override
    public Burger createBurger(String input) {

        switch(input){
            case "Basic":
                return new BasicBurger();
            case "Standard":
                return new StandardBurger();
            case "Premium":
                return new PremiumBurger();
            default:
                return null;
        }
    }
}

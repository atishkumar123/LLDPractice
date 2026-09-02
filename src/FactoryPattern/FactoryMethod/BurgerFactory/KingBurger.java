package FactoryPattern.FactoryMethod.BurgerFactory;

import FactoryPattern.FactoryMethod.Burger.*;

public class KingBurger implements BurgerFactory {


    @Override
    public Burger createBurger(String input) {
        switch(input){
            case "Basic":
                return new BasicWheatBurger();
            case "Standard":
                return new StandardWheatBurger();
            case "Premium":
                return new PremiumWheatBurger();
            default:
                return null;
        }
    }
}

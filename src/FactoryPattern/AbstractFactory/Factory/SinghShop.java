package FactoryPattern.AbstractFactory.Factory;

import FactoryPattern.AbstractFactory.Burger.*;
import FactoryPattern.AbstractFactory.GarlicBread.*;

public class SinghShop implements Factory {
    @Override
    public Burger createBurger(String type) {
        switch(type){
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

    @Override
    public GarlicBread cretaeGarlicBread(String type) {
        switch(type){
            case "Basic":
                return new BasicGarlicBread();
            case "Cheese":
                return new CheeseGarlicBread();

            default:
                return null;

        }
    }
}

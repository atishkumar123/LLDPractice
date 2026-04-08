package FactoryPattern.SimpleFactory.BurgerFactory;

import FactoryPattern.SimpleFactory.Burger.BasicBurger;
import FactoryPattern.SimpleFactory.Burger.Burger;
import FactoryPattern.SimpleFactory.Burger.PremiumBurger;
import FactoryPattern.SimpleFactory.Burger.StandardBurger;

public class BurgerFactory {

    public Burger createBurger(String input){

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

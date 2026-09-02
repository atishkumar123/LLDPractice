package FactoryPattern.AbstractFactory.Factory;

import FactoryPattern.AbstractFactory.Burger.BasicWheatBurger;
import FactoryPattern.AbstractFactory.Burger.Burger;
import FactoryPattern.AbstractFactory.Burger.PremiumWheatBurger;
import FactoryPattern.AbstractFactory.Burger.StandardWheatBurger;
import FactoryPattern.AbstractFactory.GarlicBread.BasicWheatGarlicBread;
import FactoryPattern.AbstractFactory.GarlicBread.CheeseWheatGarlicBread;
import FactoryPattern.AbstractFactory.GarlicBread.GarlicBread;

public class KingShop implements Factory{
    @Override
    public Burger createBurger(String type) {
        switch(type){
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

    @Override
    public GarlicBread cretaeGarlicBread(String type) {
        switch(type){
            case "Basic":
                return new BasicWheatGarlicBread();
            case "Cheese":
                return new CheeseWheatGarlicBread();

            default:
                return null;

        }
    }
}

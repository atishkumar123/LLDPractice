package FactoryPattern.AbstractFactory.Factory;

import FactoryPattern.AbstractFactory.Burger.Burger;
import FactoryPattern.AbstractFactory.GarlicBread.GarlicBread;

public interface Factory {

    Burger createBurger(String type);
    GarlicBread cretaeGarlicBread(String type);




}

package FactoryPattern.FactoryMethod.BurgerFactory;

import FactoryPattern.FactoryMethod.Burger.Burger;

public interface BurgerFactory {

    Burger createBurger(String input);
}

package FactoryPattern.SimpleFactory;

import FactoryPattern.SimpleFactory.Burger.Burger;
import FactoryPattern.SimpleFactory.BurgerFactory.BurgerFactory;

public class Main {

    public static void main(String[] args) {
        BurgerFactory factory= new BurgerFactory();

        Burger burger=factory.createBurger("Basic");
        burger.prepare();
    }
}

package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Burger.Burger;
import FactoryPattern.FactoryMethod.BurgerFactory.BurgerFactory;
import FactoryPattern.FactoryMethod.BurgerFactory.KingBurger;

public class User {

    public static void main(String[] args) {
        BurgerFactory burgerFactory=new KingBurger();

        Burger burger=burgerFactory.createBurger("Basic");
        burger.prepare();
    }






}

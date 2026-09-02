package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Burger.BasicBurger;
import FactoryPattern.AbstractFactory.Burger.Burger;
import FactoryPattern.AbstractFactory.Burger.StandardWheatBurger;
import FactoryPattern.AbstractFactory.Factory.Factory;
import FactoryPattern.AbstractFactory.Factory.KingShop;
import FactoryPattern.AbstractFactory.GarlicBread.GarlicBread;


public class Client {


   public static void main(String[] args) {

      Factory  kingShop=new KingShop();
      Burger basicWheat=kingShop.createBurger("Basic");
      basicWheat.prepare();

      GarlicBread basicGarlicBread= kingShop.cretaeGarlicBread("Basic");

      basicGarlicBread.prepare();


   }
   
    
    

    
}

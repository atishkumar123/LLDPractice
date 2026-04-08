package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizza.BasePizza;
import DecoratorDesignPattern.BasePizza.FarmHouse;
import DecoratorDesignPattern.ToppingDecorator.ExtraCheese;
import DecoratorDesignPattern.ToppingDecorator.Mashroom;

public class Store {

    public static void main(String[] args) {

        BasePizza basePizza=new FarmHouse();

        System.out.println(basePizza.getName()+" Pizza cost is "+basePizza.cost());
        //Now doing ExtraCheese Topping

        ExtraCheese extraCheese=new ExtraCheese(basePizza);
        System.out.println(extraCheese.getName()+" Pizza cost is "+extraCheese.cost());
        //another topping of mashrrom
        Mashroom mashroom=new Mashroom(extraCheese);
        System.out.println(mashroom.getName()+" Pizza cost is "+mashroom.cost());




    }

}

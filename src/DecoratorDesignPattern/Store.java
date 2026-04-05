package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizza.BasePizza;
import DecoratorDesignPattern.BasePizza.FarmHouse;
import DecoratorDesignPattern.ToppingDecorator.ExtraChees;
import DecoratorDesignPattern.ToppingDecorator.ToppingDecorator;
import DecoratorDesignPattern.ToppingDecorator.mushroom;

public class Store {

    public static void main(String[] args) {
        BasePizza farmhousePizza=new FarmHouse();

        System.out.println(farmhousePizza.cost());

        BasePizza farmHousePizzaWithExtraChees =new ExtraChees(farmhousePizza);

        System.out.println(farmHousePizzaWithExtraChees.cost());
        
        BasePizza farmHousePizzaWithExtraCheesandMushroom=new mushroom(farmHousePizzaWithExtraChees);
        System.out.println(farmHousePizzaWithExtraCheesandMushroom.cost());

    }

}

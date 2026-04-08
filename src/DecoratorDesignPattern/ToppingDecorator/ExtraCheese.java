package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }

    @Override
    public String getName() {
        return "ExtraChease"+ basePizza.getName();
    }
}



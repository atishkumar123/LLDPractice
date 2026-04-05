package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraChees extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraChees(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}

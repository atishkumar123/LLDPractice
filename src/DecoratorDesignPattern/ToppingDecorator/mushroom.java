package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}

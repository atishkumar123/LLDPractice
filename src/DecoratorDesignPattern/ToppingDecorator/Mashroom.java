package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class Mashroom extends ToppingDecorator{
    public Mashroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost()+200;
    }

    @Override
    public String getName() {
        return "Mushroom"+basePizza.getName();
    }
}

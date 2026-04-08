package DecoratorDesignPattern.BasePizza;

public class VegDelight implements BasePizza{
    String name="VegDelight";
    @Override
    public int cost() {
        return 300;
    }

    @Override
    public String getName() {
        return name;
    }
}

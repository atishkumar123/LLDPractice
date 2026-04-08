package DecoratorDesignPattern.BasePizza;

public class Margherita implements BasePizza{
    private String name="Margherita";
    @Override
    public int cost() {
        return 250;
    }

    @Override
    public String getName() {
        return name;
    }
}

package DecoratorDesignPattern.BasePizza;

public class FarmHouse implements BasePizza{
     private String name="FarmHouse";
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String getName() {
        return name;
    }

}

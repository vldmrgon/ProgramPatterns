package pro.patterns.structural.decorator;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}

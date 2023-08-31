package pro.patterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        SimpleCoffee simpleCoffee = new SimpleCoffee();
        Milk milk = new Milk(simpleCoffee);

        System.out.println(simpleCoffee.getCost());
        System.out.println(simpleCoffee.getDescription());

        System.out.println();

        System.out.println(milk.getCost());
        System.out.println(milk.getDescription());
    }
}

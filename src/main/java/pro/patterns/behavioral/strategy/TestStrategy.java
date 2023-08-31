package pro.patterns.behavioral.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        Context context = new Context(new AddOperation());

        context.setStrategy(new SubtractOperation());
        context.executeStrategy(5,3);
    }
}

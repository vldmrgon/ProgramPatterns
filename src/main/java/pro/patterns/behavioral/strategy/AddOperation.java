package pro.patterns.behavioral.strategy;

public class AddOperation implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("Sum numbers: " + (num1 + num2));
    }
}

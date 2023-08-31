package pro.patterns.behavioral.strategy;

public class SubtractOperation implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("Subtract numbers: " + (num1 + num2));
    }
}

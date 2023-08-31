package pro.patterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int i1, int i2) {
        strategy.doOperation(i1, i2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
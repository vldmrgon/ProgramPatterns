package pro.patterns.structural.bridge;

public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    abstract public void setEngine();
}

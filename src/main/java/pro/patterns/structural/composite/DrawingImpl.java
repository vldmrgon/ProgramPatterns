package pro.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DrawingImpl implements Car, Drawing {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Car car : cars) {
            car.draw(color);
        }
    }

    @Override
    public void add(Car car) {
        this.cars.add(car);
    }

    @Override
    public void clear() {
        this.cars.clear();
    }
}

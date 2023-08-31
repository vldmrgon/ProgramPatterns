package pro.patterns.structural.adapter;

public class Audi implements Movable {

    @Override
    public double getSpeedInMPH() {
        return 250;
    }
}

package pro.patterns.structural.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MovableAdapterImpl implements MovableAdapter {

    private final Movable cars;

    @Override
    public double getSpeedInKMPH() {
        return convertMPHtoKMPH(cars.getSpeedInMPH());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}

package pro.patterns.structural.composite;

public class TestComposite {
    public static void main(String[] args) {
        DrawingImpl drawing = new DrawingImpl();
        SportCar sportCar = new SportCar();
        UnknownCar unknownCar = new UnknownCar();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("Green");
    }
}

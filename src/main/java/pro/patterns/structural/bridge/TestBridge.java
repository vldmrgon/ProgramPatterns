package pro.patterns.structural.bridge;

public class TestBridge {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();


    }
}

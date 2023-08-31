package pro.patterns.structural.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        System.out.println(bmw.getSpeedInMPH());

        MovableAdapterImpl movableAdapter = new MovableAdapterImpl(bmw);
        System.out.println(movableAdapter.getSpeedInKMPH());
    }
}

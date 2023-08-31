package pro.patterns.creation.abstract_factory.shapes;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Rectangle");
    }
}

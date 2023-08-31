package pro.patterns.creation.abstract_factory.shapes;

public class RoundedSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("Rounded Square");
    }
}

package pro.patterns.creation.abstract_factory.shapes;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

package pro.patterns.creation.abstract_factory.producer;

import pro.patterns.creation.abstract_factory.shapes.Rectangle;
import pro.patterns.creation.abstract_factory.shapes.Shape;
import pro.patterns.creation.abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

package pro.patterns.creation.abstract_factory.producer;

import pro.patterns.creation.abstract_factory.shapes.RoundedRectangle;
import pro.patterns.creation.abstract_factory.shapes.RoundedSquare;
import pro.patterns.creation.abstract_factory.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}

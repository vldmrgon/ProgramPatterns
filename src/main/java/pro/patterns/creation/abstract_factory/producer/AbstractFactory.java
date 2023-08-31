package pro.patterns.creation.abstract_factory.producer;

import pro.patterns.creation.abstract_factory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}

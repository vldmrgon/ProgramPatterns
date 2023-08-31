package pro.patterns.creation.abstract_factory;

import pro.patterns.creation.abstract_factory.producer.AbstractFactory;
import pro.patterns.creation.abstract_factory.producer.FactoryProducer;
import pro.patterns.creation.abstract_factory.shapes.Shape;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory factory1 = FactoryProducer.getFactory(true);
        Shape rectangle1 = factory1.getShape("rectangle");
        rectangle1.draw();
    }
}

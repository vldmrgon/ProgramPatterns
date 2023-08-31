package pro.patterns.behavioral.observer;

public class TestObserver {

    public static void main(String[] args) {

        ConcreteObserver concreteObserver1 = new ConcreteObserver("observer 1");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("observer 2");
        ConcreteObserver concreteObserver3 = new ConcreteObserver("observer 3");

        Subject subject = new Subject();

        subject.addObserver(concreteObserver1);
        subject.addObserver(concreteObserver2);
        subject.addObserver(concreteObserver3);

        subject.removeObserver(concreteObserver1);

        subject.sendMessage("Hello world!!!");
    }
}
package pro.patterns.behavioral.mediator;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, null);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
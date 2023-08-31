package pro.patterns.behavioral.command;

public class ConcreteCommand implements Command {

    private String message;

    public ConcreteCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Concrete command: " + message);
    }
}

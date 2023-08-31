package pro.patterns.behavioral.command;

public class TestCommand {

    public static void main(String[] args) {

        ConcreteCommand command1 = new ConcreteCommand("Message 1");
        ConcreteCommand command2 = new ConcreteCommand("Message 2");

        CommandInvoker commandInvoker = new CommandInvoker();

        commandInvoker.setCommand(command1);
        commandInvoker.executeCommand();

        commandInvoker.setCommand(command2);
        commandInvoker.executeCommand();
    }
}

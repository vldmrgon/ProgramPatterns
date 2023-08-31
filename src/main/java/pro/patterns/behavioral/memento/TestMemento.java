package pro.patterns.behavioral.memento;

public class TestMemento {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.setMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        originator.restoreStateFromMemento(caretaker.getMemento());

        System.out.println("Current state: " + originator.getState());
    }
}
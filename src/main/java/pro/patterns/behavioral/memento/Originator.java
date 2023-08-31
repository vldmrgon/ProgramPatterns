package pro.patterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
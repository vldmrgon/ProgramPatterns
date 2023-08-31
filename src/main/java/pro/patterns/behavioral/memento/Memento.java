package pro.patterns.behavioral.memento;

import lombok.Getter;

@Getter
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
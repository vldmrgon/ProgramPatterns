package pro.patterns.behavioral.state;

import lombok.Setter;

@Setter
public class Context {

    private State state;

    public void doAction() {
        state.doAction(this);
    }
}

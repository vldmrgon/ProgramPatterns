package pro.patterns.behavioral.state;

public class NewState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Saved a new state");
        context.setState(new NewState());
    }
}

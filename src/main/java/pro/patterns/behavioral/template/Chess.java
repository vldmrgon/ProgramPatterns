package pro.patterns.behavioral.template;

public class Chess implements Game {

    @Override
    public void initialize() {
        System.out.println("Initialize chess desk");
    }

    @Override
    public void startPlay() {
        System.out.println("Start chess play");
    }

    @Override
    public void endPlay() {
        System.out.println("End chess play");
    }
}

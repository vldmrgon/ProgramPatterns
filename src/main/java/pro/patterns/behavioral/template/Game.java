package pro.patterns.behavioral.template;

public interface Game {

    default void play() {
        initialize();
        startPlay();
        endPlay();
    }

    void initialize();

    void startPlay();

    void endPlay();
}

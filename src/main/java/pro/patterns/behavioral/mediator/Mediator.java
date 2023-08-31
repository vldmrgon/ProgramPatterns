package pro.patterns.behavioral.mediator;

import java.util.List;

public interface Mediator {
    void sendMessage(String message, List<Colleague> colleagueList);
}

package pro.patterns.behavioral.mediator;

import java.util.List;

public class ConcreteMediator implements Mediator {

    @Override
    public void sendMessage(String message, List<Colleague> colleagueList) {
        colleagueList.forEach(colleague -> colleague.receiveMessage(message));
    }
}

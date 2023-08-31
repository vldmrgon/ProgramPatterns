package pro.patterns.behavioral.mediator;

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class TestMediator {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();

        List<Colleague> colleagueList = new ArrayList<>();

        IntStream
                .range(0, 3)
                .mapToObj(colleague -> new ConcreteColleague(mediator))
                .forEach(colleagueList::add);

        mediator.sendMessage("Hello world !!!", colleagueList);
    }
}
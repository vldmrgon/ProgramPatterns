package pro.patterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Person> listPerson = new ArrayList<>();

//        for (int i = 0; i < 1000; i++) {
//            Person person = new Person(1, 10, 1, 20, "M", "A", "B");
//            listPerson.add(person);
//        }
        Person person = new Person(1, 10, 1, 20, "M", "A", "B");
        for (int i = 0; i < 1000; i++) {
            Person clone = person.clone();
            listPerson.add(clone);
        }

    }
}


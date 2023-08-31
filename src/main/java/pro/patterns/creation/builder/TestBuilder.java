package pro.patterns.creation.builder;

import pro.patterns.creation.builder.java_classic.User;
import pro.patterns.creation.builder.lombok.UserBuilderOnLombok;

public class TestBuilder {
    public static void main(String[] args) {
        System.out.println("Pattern Builder");
        User vlad = new User.Builder().firstName("Vladimir").lastName("Goncharenko").id(1).age(39).build();
        System.out.println(vlad.toString());

        UserBuilderOnLombok onLombok = UserBuilderOnLombok.builder().firstName("Vladimir").lastName("Goncharenko").id(1).age(39).build();
        System.out.println(onLombok.toString());
    }
}

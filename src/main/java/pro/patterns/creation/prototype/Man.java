package pro.patterns.creation.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Man extends Hero {
    private int id;
    private int age;
    private String name;

    public Man(int live, int power, int id, int age, String name) {
        super(live, power);
        this.id = id;
        this.age = age;
        this.name = name;
    }

 }



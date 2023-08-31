package pro.patterns.creation.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero {
    private int live;
    private int power;

    public Hero(int live, int power) {
        this.live = live;
        this.power = power;
    }
}

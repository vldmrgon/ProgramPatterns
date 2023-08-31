package pro.patterns.creation.multiton;

import java.util.HashMap;
import java.util.Map;

public class Printer {

    private static final Map<String, Printer> instances = new HashMap<>();
    private String information;

    public static Printer getInstance(String name) {
        if (!instances.containsKey(name)) {
            instances.put(name, new Printer());
        }
        return instances.get(name);
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }


}

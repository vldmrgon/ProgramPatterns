package pro.patterns.creation.singleton;

public class DoubleCheckingSingleton {
    private static volatile DoubleCheckingSingleton singleton = null;

    private DoubleCheckingSingleton() {
    }

    public static DoubleCheckingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckingSingleton();
                }
            }
        }
        return singleton;
    }
}

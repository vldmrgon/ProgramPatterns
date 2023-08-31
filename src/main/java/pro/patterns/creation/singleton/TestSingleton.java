package pro.patterns.creation.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(System.identityHashCode(instance));

        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(System.identityHashCode(instance1));

        DoubleCheckingSingleton instance2 = DoubleCheckingSingleton.getInstance();
        System.out.println(System.identityHashCode(instance2));
    }
}
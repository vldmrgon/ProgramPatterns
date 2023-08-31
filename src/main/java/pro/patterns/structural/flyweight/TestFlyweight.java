package pro.patterns.structural.flyweight;

public class TestFlyweight {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        TreeType treeType = flyweightFactory.getTreeType("My", "Red", "Black");

        treeType.display(1, 2);
        treeType.display(3, 4);
    }
}

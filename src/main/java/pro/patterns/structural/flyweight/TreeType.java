package pro.patterns.structural.flyweight;

public class TreeType implements Tree {

    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Type tree: " + name);
        System.out.println("Color tree: " + color);
        System.out.println("texture tree: " + texture);
        System.out.println("Coordinates: " + x + ", " + y);
    }
}

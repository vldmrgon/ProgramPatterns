package pro.patterns.creation.multiton;

public class TestMultiton {
    public static void main(String[] args) {

        Printer info1 = Printer.getInstance("Hello");
        info1.setInformation("Hello world");

        Printer hello = Printer.getInstance("Hello");
        System.out.println(hello.getInformation());

    }
}

package pro.patterns.behavioral.iterator;

public class TestIterator {

    public static void main(String[] args) {

        MyCollection<String> collection = new MyCollection<>(3);

        collection.add("1");
        collection.add("2");
        collection.add("3");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

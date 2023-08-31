package pro.patterns.behavioral.iterator;

public class MyCollection<T> {

    private T[] elements;
    private int size = 0;

    public MyCollection(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public void add(T element) {
        if (size < elements.length)
            elements[size] = element;
        size++;
    }

    public Iterator<T> iterator() {
        return (Iterator<T>) new MyIterator();
    }

    public class MyIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T element = elements[currentIndex];
                currentIndex++;
                return element;
            }
            throw new IndexOutOfBoundsException("No more elements to iterate");
        }
    }
}

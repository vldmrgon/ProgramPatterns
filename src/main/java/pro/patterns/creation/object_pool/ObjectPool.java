package pro.patterns.creation.object_pool;

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectPool {

    private final List<ReusableObject> pool = new ArrayList<>();
    private final int maxSize;

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
        IntStream.range(0, maxSize).forEach(i -> pool.add(new ReusableObject()));
    }

    public ReusableObject getReusableObject() {
        if (pool.isEmpty()) {
            throw new IllegalStateException("Пул объектов исчерпан");
        }
        return pool.remove(pool.size() - 1);

    }

    public void returnReusableObject(ReusableObject reusableObject) {
        if (pool.size() < maxSize) {
            pool.add(reusableObject);
        }
    }

    public static class ReusableObject {
        public ReusableObject() {
            System.out.println(this.hashCode());
        }
    }
}
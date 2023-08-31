package pro.patterns.creation.object_pool;

public class TestObjectPool {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(2);

        ObjectPool.ReusableObject reusableObject1 = objectPool.getReusableObject();
        ObjectPool.ReusableObject reusableObject2 = objectPool.getReusableObject();
        ObjectPool.ReusableObject reusableObject3 = objectPool.getReusableObject();

        objectPool.returnReusableObject(reusableObject2);

        System.out.println("Ma kara");

        ObjectPool.ReusableObject reusableObject4 = objectPool.getReusableObject();
    }
}

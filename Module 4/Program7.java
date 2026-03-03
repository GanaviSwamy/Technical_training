class GarbageExample {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageExample obj = new GarbageExample();
        obj = null;

        System.gc();
        System.out.println("GC Requested");
    }
}
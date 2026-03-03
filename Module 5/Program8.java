public class ThreadLifecycleDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        });

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        Thread.sleep(500);
        System.out.println("State during sleep: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
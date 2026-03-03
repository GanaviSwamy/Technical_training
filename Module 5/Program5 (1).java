class ThreadUsingClass extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

class ThreadUsingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        ThreadUsingClass t1 = new ThreadUsingClass();
        t1.start();

        Thread t2 = new Thread(new ThreadUsingRunnable());
        t2.start();
    }
}
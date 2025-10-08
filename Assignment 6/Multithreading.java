class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is Running : ");
    }

    public void walk() {
        System.out.println("Thread is Walking : ");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();

        runnable.walk();
    }
}
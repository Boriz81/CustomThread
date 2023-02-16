package classWork2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new WorkerThread("worker-x1");
        Thread t2 = new WorkerThread("worker-x2");
        t1.start();
        t2.start();
    }
}

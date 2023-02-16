package classWork4;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableWorker(),"worker-a");
        Thread t2 = new Thread(new RunnableWorker(),"worker-b");
        Thread t3 = new Thread(new RunnableWorker(),"worker-c");
        t1.start();
        t2.start();
        t3.start();
    }
}

package classWork3;

public class Starter {
    public static void startRunnables(Runnable[] runnables) {
        for (int i = 0; i < runnables.length; i++) {
            Thread t1 = new Thread(runnables[i]);
            t1.start();
        }
    }
}


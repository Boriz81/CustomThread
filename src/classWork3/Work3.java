package classWork3;
/*import java.lang.Thread;*/
public class Work3 {
    public static void main(String[] args) {
        HelloThread2 t1 = new HelloThread2();
        HelloThread2 t2 = new HelloThread2();
        Runnable[] a = {t1, t2};
        Starter.startRunnables(a);

    }
}

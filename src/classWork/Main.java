package classWork;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MessageNotifier("Hello, Mary", 3);
        t1.start();
    }
}

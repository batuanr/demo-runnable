public class Main {
    public static void main(String[] args) {
        Runnable dome1 = new RunnableDemo("demo1");
        Runnable dome2 = new RunnableDemo("demo2");

        Thread t1 = new Thread(dome1);
        Thread t2 = new Thread(dome2);

        t1.start();
        t2.start();

        }
    }

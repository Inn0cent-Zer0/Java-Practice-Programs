public class Thread {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Thread 1");
        PrintThread thread2 = new PrintThread("Thread 2");
        PrintThread thread3 = new PrintThread("Thread 3");
        System.err.println("Starting Threads");
        /*thread1.start();
        thread2.start();
        thread3.start();*/
        System.err.println("Threads Started, main ends\n");

    }

    protected static void sleep(long out) {
    }
}

class PrintThread extends Thread {
    private final int sleepTime;

    public PrintThread(String name) {
        /*super(name);*/
        sleepTime = (int) (Math.random() * 5001);
    }

    public void run() {
        /*try {
         *//* System.err.println(getName() + "going to sleep for" + sleepTime);
            Thread.sleep(sleepTime);*//*
        } catch (InterruptedException exception) {
      *//*      exception.PrintStackTrace();*//*
        }
        System.err.println(getName() + "done sleeping");*/
    }
}
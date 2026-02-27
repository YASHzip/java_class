class NumberPrinter implements Runnable {

    private int start;
    private int end;
    private String threadName;

    public NumberPrinter(int start, int end, String threadName) {
        this.start = start;
        this.end = end;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(threadName + " : " + i);

            try {
                Thread.sleep(200); // pause for 200 milliseconds
            } 
            catch (InterruptedException e) {
                // Proper interruption handling
                Thread.currentThread().interrupt();
                System.out.println(threadName + " was interrupted");
                return;
            }
        }
    }
}

public class JavaThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(new NumberPrinter(1, 5, "Thread-1"));
        Thread t2 = new Thread(new NumberPrinter(6, 10, "Thread-2"));

        t1.start();
        t2.start();
    }
}
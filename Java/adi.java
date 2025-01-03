class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class adi {
    public static void main(String[] args) {
        // Create three threads
        HelloThread thread1 = new HelloThread();
        HelloThread thread2 = new HelloThread();
        HelloThread thread3 = new HelloThread();

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display "HAPPY ENDING"
        System.out.println("HAPPY ENDING");
    }
}

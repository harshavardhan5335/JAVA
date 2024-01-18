public class ThreadDemo extends Thread {

    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Name: Your Name, Thread ID: " + Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
    }
}

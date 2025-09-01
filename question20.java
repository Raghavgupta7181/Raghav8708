//Write a program to declare a volatile variable and explain its use in multithreading
class question20 {
    
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        
        Thread updater = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work
                System.out.println("Updater Thread: Changing flag to true.");
                flag = true; // Update the volatile variable
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        
        Thread monitor = new Thread(() -> {
            System.out.println("Monitor Thread: Waiting for flag to become true...");
            while (!flag) {
                
            }
            System.out.println("Monitor Thread: Detected flag change!");
        });

        updater.start();
        monitor.start();
    }
}

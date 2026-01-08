class UrgentJob extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Urgent print job - Page " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class RegularJob extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Regular print job - Page " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class BulkJob extends Thread {
    public void run() {
        for (int i = 1; i <= 1; i++) {
            System.out.println("Bulk print job - Page " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

public class PrintJobPriorityDemo {
    public static void main(String[] args) {
        UrgentJob urgent = new UrgentJob();
        RegularJob regular = new RegularJob();
        BulkJob bulk = new BulkJob();

        urgent.setName("Thread-0");
        regular.setName("Thread-1");
        bulk.setName("Thread-2");

        urgent.setPriority(Thread.MAX_PRIORITY);
        regular.setPriority(Thread.NORM_PRIORITY);
        bulk.setPriority(Thread.MIN_PRIORITY);

        urgent.start();
        regular.start();
        bulk.start();
    }
}

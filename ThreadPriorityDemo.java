class ReportGeneration extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Report generation - " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class TransactionProcessing extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Transaction processing - " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class LoggingActivity extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Logging activity - " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ReportGeneration report = new ReportGeneration();
        TransactionProcessing transaction = new TransactionProcessing();
        LoggingActivity log = new LoggingActivity();

        report.setName("Thread-0");
        transaction.setName("Thread-1");
        log.setName("Thread-2");

        report.setPriority(Thread.MIN_PRIORITY);
        transaction.setPriority(Thread.MAX_PRIORITY);
        log.setPriority(Thread.NORM_PRIORITY);

        report.start();
        transaction.start();
        log.start();
    }
}

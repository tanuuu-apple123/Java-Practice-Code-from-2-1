import java.util.Scanner;

public class StudentScoreAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[100];
        System.out.print("Enter number of students (max 100): ");
        int n = sc.nextInt();

        if (n <= 0 || n > 100) {
            System.out.println("Invalid number of students.");
            return;
        }

        // Read scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        // Mean
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scores[i];
        }
        double mean = sum / n;

        // Standard Deviation
        double variance = 0;
        for (int i = 0; i < n; i++) {
            variance += Math.pow(scores[i] - mean, 2);
        }
        variance /= n;
        double stdDev = Math.sqrt(variance);

        // Percentage distribution
        int[] ranges = new int[11]; // 0: <10, 1: 10-19, ..., 9: 80-89, 10: >=90
        for (int i = 0; i < n; i++) {
            int score = scores[i];
            if (score < 10) ranges[0]++;
            else if (score >= 90) ranges[10]++;
            else ranges[score / 10]++;
        }

        // Print summary
        System.out.println("\n===== Statistical Summary =====");
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);

        System.out.println("\nPercentage Distribution:");
        System.out.printf("<10 : %.2f%%%n", (ranges[0] * 100.0 / n));
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d-%d : %.2f%%%n", i * 10, i * 10 + 9, (ranges[i] * 100.0 / n));
        }
        System.out.printf(">=90 : %.2f%%%n", (ranges[10] * 100.0 / n));

        sc.close();
    }
}

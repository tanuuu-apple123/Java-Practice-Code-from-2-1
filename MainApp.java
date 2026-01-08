package onlineexam.main;

import onlineexam.implementation.ExamPortal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamPortal portal = new ExamPortal();

        portal.startExam();

        try {
            System.out.print("Enter your score (0 - 100): ");
            int score = scanner.nextInt();
            portal.evaluateScore(score);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a numeric score.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Result: " + e.getMessage());
        } finally {
            System.out.println("Thank you for attending the exam.");
            scanner.close();
        }
    }
}

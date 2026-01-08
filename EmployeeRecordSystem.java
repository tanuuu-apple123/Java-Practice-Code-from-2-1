import java.util.Scanner;

public class EmployeeRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Age (byte): ");
        byte age = sc.nextByte();

        System.out.print("Enter Years of Experience (short): ");
        short experience = sc.nextShort();

        System.out.print("Enter Employee ID (int): ");
        int empId = sc.nextInt();

        System.out.print("Enter Annual Salary in Rs. (long): ");
        long salary = sc.nextLong();

        System.out.print("Enter Working Hours per Day (float): ");
        float workingHoursPerDay = sc.nextFloat();

        System.out.print("Enter Annual Performance Score (double): ");
        double score = sc.nextDouble();

        System.out.print("Enter Grade (char): ");
        char grade = sc.next().charAt(0);

        System.out.print("Is the employee permanent? (true/false): ");
        boolean isPermanent = sc.nextBoolean();

        float monthlyWorkHours = workingHoursPerDay * 22;

        System.out.println("\n--------------- Employee Profile ---------------");
        System.out.println("Employee ID\t\t\t: " + empId);
        System.out.println("Age                 \t\t: " + age);
        System.out.println("Experience (Years)\t\t: " + experience);
        System.out.println("Salary (Annual Rs.)\t\t: " + salary);
        System.out.println("Working Hours/Day   \t\t: " + workingHoursPerDay);
        System.out.println("Monthly Work Hours \t\t: " + monthlyWorkHours);
        System.out.println("Performance Score\t\t: " + score);
        System.out.println("Grade               \t\t: " + grade);
        System.out.println("Permanent Employee?\t: " + isPermanent);

        if (score >= 85.0 && isPermanent) {
            System.out.println("Eligible for performance bonus.");
        } else {
            System.out.println("Not eligible for bonus.");
        }

        sc.close();
    }
}

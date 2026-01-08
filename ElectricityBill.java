import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        double totalRevenue = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter units consumed for Customer " + i + ": ");
            int units = sc.nextInt();
            double bill;

            if (units <= 100) {
                bill = units * 1.5;
            } else if (units <= 300) {
                bill = 100 * 1.5 + (units - 100) * 2.5;
            } else {
                bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4.0;
            }

            System.out.printf("Customer %d: %.2f%n", i, bill);
            totalRevenue += bill;
        }

        System.out.printf("Total Revenue: %.2f%n", totalRevenue);
        sc.close();
    }
}

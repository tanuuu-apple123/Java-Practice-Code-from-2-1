import java.util.Scanner;

public class ItemizedBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int numItems = sc.nextInt();
        double totalAmount = 0;

        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter price for Item " + i + ": ");
            double price = sc.nextDouble();

            if (price > 1000) {
                price = price * 0.9; // Apply 10% discount
                System.out.println("Item " + i + ": " + price + " (10% discount applied)");
            } else {
                System.out.println("Item " + i + ": " + price);
            }

            totalAmount += price;
        }

        System.out.println("------- Final Bill -------");
        System.out.printf("Total Amount to Pay: %.2f\n", totalAmount);

        sc.close();
    }
}

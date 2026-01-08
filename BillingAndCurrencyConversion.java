import java.util.Scanner;

public class BillingAndCurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input billing details
        System.out.print("Enter Quantity (byte): ");
        byte quantity = sc.nextByte();

        System.out.print("Enter Unit Price (int): ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter Tax Rate (in decimal, e.g., 0.18 for 18%): ");
        float taxRate = sc.nextFloat();

        // Step 2: Perform calculations
        int baseAmount = quantity * unitPrice;              // byte → int (implicit promotion)
        float taxAmount = baseAmount * taxRate;             // int → float (promotion)
        double totalAmount = baseAmount + taxAmount;        // float → double (promotion)

        // Step 3: Display billing summary
        System.out.println("\n----------- Billing Summary -----------");
        System.out.println("Quantity (byte): " + quantity);
        System.out.println("Unit Price (int): Rs." + unitPrice);
        System.out.println("Base Amount (int): Rs." + baseAmount);
        System.out.println("Tax Rate (float): " + taxRate);
        System.out.println("Tax Amount (float): Rs." + taxAmount);
        System.out.println("Total Amount to Pay (double): Rs." + totalAmount);

        // Step 4: Payment in USD
        System.out.print("\nEnter Payment in USD for the above total: ");
        double paymentUSD = sc.nextDouble();

        System.out.print("Enter USD to INR Conversion Rate (float): ");
        float conversionRate = sc.nextFloat();

        // Explicit type conversion: double → float
        float convertedINR = (float) (paymentUSD * conversionRate);

        // Step 5: Display conversion summary
        System.out.println("\n----------- USD to INR Conversion -----------");
        System.out.println("Amount Paid in USD: $" + paymentUSD);
        System.out.println("Conversion Rate: " + conversionRate);
        System.out.println("Converted Amount in INR: Rs." + convertedINR);

        // Step 6: Check payment status
        if (convertedINR >= totalAmount) {
            double change = convertedINR - totalAmount;
            System.out.println("Payment is sufficient.");
            System.out.printf("Change to return: Rs.%.2f\n", change);
        } else {
            double shortage = totalAmount - convertedINR;
            System.out.println("Payment is insufficient.");
            System.out.printf("Additional amount required: Rs.%.2f\n", shortage);
        }

        sc.close();
    }
}

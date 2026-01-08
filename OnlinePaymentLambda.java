import java.util.Scanner;

// Functional interface for payment calculation
@FunctionalInterface
interface PaymentProcessor {
    double process(double amount);
}

public class OnlinePaymentLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: Rs.");
        double purchaseAmount = sc.nextDouble();

        // Lambda expressions for each payment method
        PaymentProcessor creditCard = (amount) -> amount + (amount * 0.02);   // 2% transaction fee
        PaymentProcessor upi = (amount) -> amount + 5;                        // Flat Rs. 5
        PaymentProcessor cod = (amount) -> amount + 30;                       // Rs. 30 handling charge

        // Display results
        System.out.println("\n------- Estimated Payable Amount -------");
        System.out.println("Via Credit Card Amount to be paid = Rs." + creditCard.process(purchaseAmount));
        System.out.println("Via UPI Amount to be paid = Rs." + upi.process(purchaseAmount));
        System.out.println("Via Cash on Delivery Amount to be paid = Rs." + cod.process(purchaseAmount));

        sc.close();
    }
}

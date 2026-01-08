import java.util.Scanner;

@FunctionalInterface
interface DataProcessor<T> {
    T process(T a, T b);
}

public class EcommerceDataProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------- E-commerce Data Processing -------");
            System.out.println("1. Find Maximum of Two Product Quantities");
            System.out.println("2. Apply Discount on Product Price");
            System.out.println("3. Concatenate Customer Names");
            System.out.println("4. Count Words in a Customer Review");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter first quantity: ");
                    int q1 = sc.nextInt();
                    System.out.print("Enter second quantity: ");
                    int q2 = sc.nextInt();

                    DataProcessor<Integer> maxQuantity = (a, b) -> (a > b) ? a : b;
                    System.out.println("Maximum Quantity: " + maxQuantity.process(q1, q2));
                    break;

                case 2:
                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter discount percentage: ");
                    double discount = sc.nextDouble();

                    DataProcessor<Double> applyDiscount = (p, d) -> p - (p * d / 100);
                    System.out.println("Final Price after Discount: " + applyDiscount.process(price, discount));
                    break;

                case 3:
                    System.out.print("Enter first name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lname = sc.nextLine();

                    DataProcessor<String> concatenate = (a, b) -> a + " " + b;
                    System.out.println("Full Name: " + concatenate.process(fname, lname));
                    break;

                case 4:
                    System.out.print("Enter customer review: ");
                    String review = sc.nextLine();

                    DataProcessor<String> wordCount = (a, b) -> {
                        String[] words = a.trim().split("\\s+");
                        return String.valueOf(words.length);
                    };
                    System.out.println("Word Count: " + wordCount.process(review, ""));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 5);

        sc.close();
    }
}

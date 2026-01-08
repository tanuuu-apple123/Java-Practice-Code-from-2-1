import java.util.*;
import java.util.stream.*;

public class ProductCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + n + " integer values:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Element " + i + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nList of numbers: " + numbers);

        Optional<Integer> productOptional = numbers.stream().reduce((a, b) -> a * b);
        int productWithIdentity = numbers.stream().reduce(1, (a, b) -> a * b);

        if (productOptional.isPresent())
            System.out.println("Product using Optional: " + productOptional.get());
        else
            System.out.println("Product using Optional: No elements");

        System.out.println("Product using identity value: " + productWithIdentity);
    }
}

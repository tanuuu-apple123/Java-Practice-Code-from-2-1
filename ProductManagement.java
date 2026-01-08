import java.util.*;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using ArrayList to store product names
        ArrayList<String> products = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n------------------ Product Management System ------------------");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to add: ");
                    String productToAdd = sc.nextLine();
                    products.add(productToAdd);
                    System.out.println(productToAdd + " added successfully");
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = sc.nextLine();
                    if (products.remove(productToRemove))
                        System.out.println(productToRemove + " removed successfully");
                    else
                        System.out.println("Product not found");
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String productToSearch = sc.nextLine();
                    if (products.contains(productToSearch))
                        System.out.println(productToSearch + " is available in store");
                    else
                        System.out.println("Product not found");
                    break;

                case 4:
                    System.out.println("--- Product List ---");
                    if (products.isEmpty())
                        System.out.println("No products available");
                    else {
                        int i = 1;
                        for (String product : products)
                            System.out.println(i++ + ". " + product);
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        // Demonstrating LinkedList and HashSet separately
        LinkedList<String> linkedListDemo = new LinkedList<>(products);
        HashSet<String> hashSetDemo = new HashSet<>(products);

        System.out.println("\nDemonstration of LinkedList and HashSet:");
        System.out.println("Products in LinkedList: " + linkedListDemo);
        System.out.println("Products in HashSet (no duplicates): " + hashSetDemo);
    }
}
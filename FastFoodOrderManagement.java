import java.util.*;

class Order {
    int orderId;
    String customerName;
    String itemName;

    public Order(int orderId, String customerName, String itemName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
    }

    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Item: " + itemName;
    }
}

public class FastFoodOrderManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Order> orderQueue = new LinkedList<>();

        int choice;
        do {
            System.out.println("\n------------------ Fast-Food Order Management System ------------------");
            System.out.println("1. Add New Order");
            System.out.println("2. Serve Next Order");
            System.out.println("3. Cancel Order");
            System.out.println("4. View All Pending Orders");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    String item = sc.nextLine();
                    orderQueue.add(new Order(id, name, item));
                    System.out.println("Order added successfully");
                    break;

                case 2:
                    if (orderQueue.isEmpty()) {
                        System.out.println("No orders to serve.");
                    } else {
                        Order served = orderQueue.removeFirst();
                        System.out.println("Serving Order → " + served);
                    }
                    break;

                case 3:
                    if (orderQueue.isEmpty()) {
                        System.out.println("No orders to cancel.");
                    } else {
                        System.out.print("Enter Order ID to cancel: ");
                        int cancelId = sc.nextInt();
                        boolean found = false;
                        Iterator<Order> itr = orderQueue.iterator();
                        while (itr.hasNext()) {
                            Order o = itr.next();
                            if (o.orderId == cancelId) {
                                itr.remove();
                                System.out.println("Order ID " + cancelId + " cancelled successfully.");
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Order not found.");
                    }
                    break;

                case 4:
                    if (orderQueue.isEmpty()) {
                        System.out.println("No pending orders.");
                    } else {
                        System.out.println("Pending Orders:");
                        for (Order o : orderQueue) {
                            System.out.println(o);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}

import java.util.*;
import java.util.stream.*;

public class EmployeeStreamIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of employee " + i + ": ");
            employees.add(sc.nextLine());
        }

        Stream<String> empStream = employees.stream();
        Iterator<String> iterator = empStream.iterator();

        System.out.println("\nEmployee Names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

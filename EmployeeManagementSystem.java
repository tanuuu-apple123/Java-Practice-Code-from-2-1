import java.util.Scanner;

class Employee {
    String name;
    int id;
    String department;
    double basicSalary;
    double grossSalary;

    void inputDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.print("Enter Department: ");
        department = sc.next();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        calculateGross();
    }

    void calculateGross() {
        double hra = 0.2 * basicSalary;
        double da = 0.1 * basicSalary;
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].inputDetails(sc);
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            e.display();
        }

        sc.close();
    }
}

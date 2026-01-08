import java.util.*;

public class StudentMarksManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        int choice;

        do {
            System.out.println("\n-------------- Student Marks Management System --------------");
            System.out.println("1. Add/Update Student Marks");
            System.out.println("2. View Marks by Roll Number");
            System.out.println("3. Remove Student Record");
            System.out.println("4. Display All Student Records");
            System.out.println("5. Count Total Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks (0 - 100): ");
                    int marks = sc.nextInt();
                    studentMarks.put(roll, marks);
                    System.out.println("Record saved for Roll No: " + roll);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to view marks: ");
                    int r = sc.nextInt();
                    if (studentMarks.containsKey(r))
                        System.out.println("Marks for Roll No " + r + ": " + studentMarks.get(r));
                    else
                        System.out.println("Record not found.");
                    break;

                case 3:
                    System.out.print("Enter Roll Number to remove: ");
                    int rem = sc.nextInt();
                    if (studentMarks.remove(rem) != null)
                        System.out.println("Record removed for Roll No: " + rem);
                    else
                        System.out.println("Record not found.");
                    break;

                case 4:
                    if (studentMarks.isEmpty()) {
                        System.out.println("No records available.");
                    } else {
                        System.out.println("--- All Student Records (Sorted by Roll No) ---");
                        TreeMap<Integer, Integer> sorted = new TreeMap<>(studentMarks);
                        for (Map.Entry<Integer, Integer> entry : sorted.entrySet())
                            System.out.println("Roll No: " + entry.getKey() + ", Marks: " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " + studentMarks.size());
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}

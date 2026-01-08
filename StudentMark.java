import java.util.Scanner;

public class StudentMark {
	 int fail = 0;
       	int pass = 0;
    public void PassFail() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = console.nextInt();
       

        for (int i = 1; i <= n; i++) {
            console.nextLine(); // consume leftover newline
            System.out.print("Enter student " + i + " name: ");
            String student_name = console.nextLine();
            System.out.print("Enter student " + i + " marks: ");
            double marks = console.nextDouble();

            if (marks <= 40) {
                System.out.println("Student name: " + student_name + " Status: Fail");
                fail++;
            } else {
                System.out.println("Student name: " + student_name + " Status: Pass");
                pass++;
            }
        }

        System.out.println("Total number of students failed: " + fail);
        System.out.println("Total number of students passed: " + pass);
        console.close();
    }

    public static void main(String[] args) {
        StudentMark obj = new StudentMark();
        obj.PassFail();
    }
}
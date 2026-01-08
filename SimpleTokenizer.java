import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("\nChoose delimiter option:\n1. Space\n2. Comma\n3. Tab\nEnter choice (1-3): ");
       
        int choice = sc.nextInt();

        String delimiter = " ";
        switch (choice) {
            case 2:
                delimiter = ",";
                break;
            case 3:
                delimiter = "\t";
                break;
            default:
                delimiter = " ";
        }

        StringTokenizer st = new StringTokenizer(input, delimiter);
        System.out.println("\nTokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}

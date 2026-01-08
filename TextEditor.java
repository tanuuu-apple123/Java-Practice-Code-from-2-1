import java.util.Scanner;
import java.util.StringTokenizer;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String input = sc.nextLine();
        StringBuffer buffer = new StringBuffer(input);

        while (true) {
            System.out.println("\nCurrent Text: " + buffer);
            System.out.println("\nChoose an operation:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Replace text");
            System.out.println("4. Delete text");
            System.out.println("5. Reverse text");
            System.out.println("6. Set specific character");
            System.out.println("7. Set length");
            System.out.println("8. Show char at index");
            System.out.println("9. Show capacity & length");
            System.out.println("10. Exit");
            System.out.print("Enter your choice (1-10): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    buffer.append(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter text to insert: ");
                    buffer.insert(pos, sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement text: ");
                    buffer.replace(start, end, sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter start index: ");
                    start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    end = sc.nextInt();
                    buffer.delete(start, end);
                    break;
                case 5:
                    buffer.reverse();
                    break;
                case 6:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter character: ");
                    char c = sc.next().charAt(0);
                    buffer.setCharAt(idx, c);
                    break;
                case 7:
                    System.out.print("Enter new length: ");
                    buffer.setLength(sc.nextInt());
                    break;
                case 8:
                    System.out.print("Enter index: ");
                    System.out.println("Character at index: " + buffer.charAt(sc.nextInt()));
                    break;
                case 9:
                    System.out.println("Capacity: " + buffer.capacity());
                    System.out.println("Length: " + buffer.length());
                    break;
                case 10:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

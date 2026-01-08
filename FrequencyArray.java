import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] fr = new int[n];
        int visited = -1;

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (fr[i] == visited) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited; // mark as counted
                }
            }
            fr[i] = count;
        }

        // Print result
        for (int i = 0; i < n; i++) {
            if (fr[i] != visited) {
                System.out.println(arr[i] + " frequency " + fr[i]);
            }
        }

        sc.close();
    }
}

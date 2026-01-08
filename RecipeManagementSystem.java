import java.io.*;
import java.util.Scanner;

public class RecipeManagementSystem {
    static final String FILENAME = "recipes.txt";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice;

        do {
            System.out.println("---- Recipe Management System ----");
            System.out.println("1. Add a new recipe");
            System.out.println("2. View all recipes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            while (!console.hasNextInt()) {
                System.out.print("Invalid input. Enter your choice (1-3): ");
                console.next();
            }
            choice = console.nextInt();
            console.nextLine();  // consume leftover newline

            switch (choice) {
                case 1:
                    addRecipe(console);
                    break;
                case 2:
                    viewRecipes();
                    break;
                case 3:
                    System.out.println("Exiting the Recipe Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        console.close();
    }

    // Method to add a new recipe to the file
    private static void addRecipe(Scanner console) {
        System.out.print("Enter recipe name: ");
        String recipeName = console.nextLine().trim();

        System.out.print("Enter recipe instructions: ");
        String instructions = console.nextLine().trim();

        try (FileWriter fw = new FileWriter(FILENAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Recipe Name: " + recipeName);
            bw.newLine();
            bw.write("Instructions: " + instructions);
            bw.newLine();
            bw.write("--------------------------------------------------");
            bw.newLine();

            System.out.println("Recipe saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving recipe: " + e.getMessage());
        }
    }

    // Method to read and display all recipes
    private static void viewRecipes() {
        System.out.println("\nRecipes in the Recipe Book:\n");

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            boolean isEmpty = true;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }
            if (isEmpty) {
                System.out.println("No recipes found.");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("No recipes found. The recipe book is empty.");
        } catch (IOException e) {
            System.out.println("Error reading recipes: " + e.getMessage());
        }
    }
}

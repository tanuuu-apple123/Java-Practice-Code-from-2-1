import java.util.Scanner;

public class HonorsEligibility {

    // Instance method (not static)
    public void checkHonorsEligibility() {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 2;

        // Arrays to store student data
        int[] rollNumbers = new int[numberOfStudents];
        short[] years = new short[numberOfStudents];
        byte[] sections = new byte[numberOfStudents];
        float[] studyHours = new float[numberOfStudents];
        double[] cgpas = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        boolean[] interested = new boolean[numberOfStudents];
       

        // Input for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Roll Number: ");
            rollNumbers[i] = scanner.nextInt();

            System.out.print("Year of Study: ");
            years[i] = scanner.nextShort();

            System.out.print("Section (byte): ");
            sections[i] = scanner.nextByte();

            System.out.print("Average Study Hours/Day: ");
            studyHours[i] = scanner.nextFloat();

            System.out.print("CGPA: ");
            cgpas[i] = scanner.nextDouble();

            System.out.print("Grade: ");
            grades[i] = scanner.next().charAt(0);

            System.out.print("Interested in honors? (true/false): ");
            interested[i] = scanner.nextBoolean();
        }

        // Check eligibility for each student
        
        System.out.println("-------Student Record---------");
        for(int i=0;i<numberOfStudents;i++){
        System.out.println("Roll No "+ rollNumbers[i]+"\nYear: "+ years[i]+"\nSection: "+sections[i]+"\nStudy Hours/Day: "+studyHours[i]+"\nCGPA: " +cgpas[i]+"\nGrade: "+grades[i]+"\nInterested in Honors :"+interested[i]);
        if (cgpas[i] >= 8.2 && grades[i] == 'A' && interested[i]) 
        System.out.println("Student is eligible for honors.");
        else
        System.out.println("Student is not eligible for honors.");
        
       
    }
     scanner.close();

}
    // Main method (still has to be static)
    public static void main(String[] args) {
        HonorsEligibility obj = new HonorsEligibility();  // create object
        obj.checkHonorsEligibility();                     // call the instance method
    }
}

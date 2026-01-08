import java.util.Scanner;

public class SensorDataAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sensor 1 Reading (byte): ");
        byte sensor1 = sc.nextByte();

        System.out.print("Enter Sensor 2 Reading (short): ");
        short sensor2 = sc.nextShort();

        int combined = sensor1 + sensor2;

        System.out.print("\nEnter Base Energy Reading (int): ");
        int baseEnergy = sc.nextInt();

        System.out.print("Enter Scale Factor (float, e.g., 1.18): ");
        float scaleFactor = sc.nextFloat();

        float scaledEnergy = baseEnergy * scaleFactor;

        System.out.print("\nEnter Precision Constant (double, e.g., 3.14159): ");
        double precision = sc.nextDouble();

        int rounded = (int) precision;

        System.out.print("Enter Signal Strength (float): ");
        float signalStrength = sc.nextFloat();

        short transmitted = (short) signalStrength;

        System.out.println("\n===== Processed Sensor Summary =====");
        System.out.println("Sensor 1 (byte): " + sensor1);
        System.out.println("Sensor 2 (short): " + sensor2);
        System.out.println("Combined Result (int): " + combined);

        System.out.println("\nBase Energy (int): " + baseEnergy);
        System.out.println("Scale Factor (float): " + scaleFactor);
        System.out.println("Scaled Energy (float): " + scaledEnergy);

        System.out.println("\nPrecision Constant (double): " + precision);
        System.out.println("Rounded Value (int): " + rounded);

        System.out.println("\nSignal Strength (float): " + signalStrength);
        System.out.println("Converted for Transmission (short): " + transmitted);

        sc.close();
    }
}

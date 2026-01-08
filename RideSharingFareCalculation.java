import java.util.Scanner;

@FunctionalInterface
interface FareStrategy {
    double calculateFare(double distance);
}

public class RideSharingFareCalculation {
    public static void printFare(String rideType, FareStrategy strategy, double distance) {
        double fare = strategy.calculateFare(distance);
        System.out.println(rideType + " Ride Fare: Rs." + fare);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();

        FareStrategy standardRide = d -> 50 + 10 * d;
        FareStrategy premiumRide = d -> 100 + 20 * d;
        FareStrategy sharedRide = d -> 30 + 8 * d;

        System.out.println("\n------ Fare Calculation Summary ------");
        printFare("Standard", standardRide, distance);
        printFare("Premium", premiumRide, distance);
        printFare("Shared", sharedRide, distance);

        sc.close();
    }
}

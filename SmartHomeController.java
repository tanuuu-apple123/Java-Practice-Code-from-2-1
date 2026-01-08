package smarthome.control;

import smarthome.devices.*;

import java.util.Scanner;

public class SmartHomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        SmartDevice thermostat = new SmartThermostat();

        SmartDevice selectedDevice = null;

        while (true) {
            System.out.println("\nSmart Home Device Control System");
            System.out.println("1. Select Smart Light");
            System.out.println("2. Select Smart Fan");
            System.out.println("3. Select Smart Thermostat");
            System.out.println("4. Turn ON");
            System.out.println("5. Turn OFF");
            System.out.println("6. Get Status");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedDevice = light;
                    System.out.println("Smart Light selected.");
                    break;
                case 2:
                    selectedDevice = fan;
                    System.out.println("Smart Fan selected.");
                    break;
                case 3:
                    selectedDevice = thermostat;
                    System.out.println("Smart Thermostat selected.");
                    break;
                case 4:
                    if (selectedDevice != null) {
                        selectedDevice.turnOn();
                    } else {
                        System.out.println("Please select a device first.");
                    }
                    break;
                case 5:
                    if (selectedDevice != null) {
                        selectedDevice.turnOff();
                    } else {
                        System.out.println("Please select a device first.");
                    }
                    break;
                case 6:
                    if (selectedDevice != null) {
                        System.out.println(selectedDevice.getStatus());
                    } else {
                        System.out.println("Please select a device first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting Smart Home System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

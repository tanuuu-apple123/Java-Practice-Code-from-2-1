/*******************
Program name:MessageStorageAndRetrieval.java
Programmer  :Tanavya
Date        :8/10/2025
Purpose     :to demonstrate byte stream
********************/

import java.io.*;
import java.util.Scanner;
public class MessageStorageAndRetrieval{
    static String FILENAME="backup123.txt";
    public static void main(String[] args)
    {
        Scanner console=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("----------- Message Storage & Retrieval System -----------");
            System.out.println("1.Write a new message");
            System.out.println("2.Read all messages");
            System.out.println("3.Exit");
            System.out.println("enter your choice");
            choice=console.nextInt();
            console.nextLine();
            switch(choice)
            {
                case 1:
                    addMessage();
                    break;
                case 2:
                    viewMessage();
                    break;
                case 3:
                    System.out.println("Thank you! use it again!! Exiting ");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!try again!!!");

            }

        }while(choice!=3);
        
    }

    //method to add notes to a backup file and save it
    public static void addMessage() {
    Scanner console = new Scanner(System.in);
    System.out.println("Enter your message:");
    String note = console.nextLine(); //

    try (FileWriter fos = new FileWriter(FILENAME, true)) {
        fos.write(note + "\n");
        System.out.println("Message saved successfully.");
    } catch (IOException e) {
        System.out.println("Message not saved! Error: " + e.getMessage());
    }
}

    //method to view all notes from a backup files display it
    public static void viewMessage() {
    System.out.println("Notes retrieved from backup file:");
    try (FileReader fis = new FileReader(FILENAME)) {
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();
    } catch (IOException e) {
        System.out.println("Error reading messages: " + e.getMessage());
    }
}

}
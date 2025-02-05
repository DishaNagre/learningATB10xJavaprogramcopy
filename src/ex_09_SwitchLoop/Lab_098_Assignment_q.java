package ex_09_SwitchLoop;

import java.util.Scanner;

public class Lab_098_Assignment_q {
    public static void main(String[] args) {

        //CLI opyions-> Using Scanner class

        //
         // Take a user input - Name, age and Saalary and print them in the end
        // Create a scanner object for reading Input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        // Print the collected Informatiion

        System.out.println("\n--- User Information---");
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
        System.out.println("salary:"+salary);

        // Clsoe the scanner class
        scanner.close();



    }
}

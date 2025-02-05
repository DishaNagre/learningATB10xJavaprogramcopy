package ex_09_SwitchLoop;

import java.util.Scanner;

public class Lab_092_Switch_2 {
    public static void main(String[] args) {
        // switch is use while web automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute  of firefox
        // edge -> edge browser cases.

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("...............");
                System.out.println("TC");
                break;
            case "firefox" :
                System.out.println("Starting the firefox browser");
                // Further code to start the browser
                // Webdriver driver = new Firfox(); // selenium code
                break;
            case "Edge" :
                System.out.println("Execute the edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }






    }
}

package ex_08_if_Condition;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Lab083_Odd_Even_program {
    public static void main(String[] args) {
        // create a program - Take user input
        // Check weather bthe input is even or odd number

        // Logic building formula
        //Step 1- Figure out input and Output
        // number (int)-> input/output -> Scanner class can be use to take input
    // string -> odd or even -> O/p, Println method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int number");
        int num = sc.nextInt();

        //Step 2- Rough Logic
        // num%2  ==0 -> even - modulus- R == 0-> EVEN
        // num%2 != 0 -> odd

        // Step -3- Write a logic
        if(num%2 ==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
sc.close(); // means stop taking input now.

        // Step -4 edge cases
        //large int, -negative handle , zero

    }
}

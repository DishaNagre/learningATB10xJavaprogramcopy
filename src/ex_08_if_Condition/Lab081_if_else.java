package ex_08_if_Condition;

import java.util.Scanner;

public class Lab081_if_else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> Allowed to vote.
        // else age < >18 - Not allowed to vote
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur age!(as integer)");
        int age = sc.nextInt();



        if (age > 18){
            System.out.println("Allowed to vote!");
            } else {
            System.out.println("Not allowed");
        }
    }
}

package Task_19th_Jan;
import java.util.Scanner;

public class Program_01_LargestOfThree {
    // Finding the Largest of Three Numbers a,b,c using the Ternary Operator.

    public static void main(String[] args) {
        int a=50, b=20, c=15;
        // using ternary operator ?: to find largest number
        int largest = (a > b)
                ? (a > c ? a : c)  // If a is greater than b, compare a with c
                : (b > c ? b : c); // If b is greater than a, compare b with c
        System.out.println("The largest number is: " + largest);}
}

// now using the Scanner Class

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("frist number");
//        int a = sc.nextInt();
//        System.out.println("second number");
//        int b = sc.nextInt();
//        System.out.println("third number");
//        int c = sc.nextInt();
//
//        int largest = (a > b)
//                ? (a > c ? a : c)  // If a > b, compare a with c
//                : (b > c ? b : c); // If b > a, compare b with c
//        System.out.println("The largest number is: " + largest);
//
//        sc.close();
//
//    }
//}

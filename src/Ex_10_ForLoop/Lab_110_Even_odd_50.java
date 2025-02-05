package Ex_10_ForLoop;

public class Lab_110_Even_odd_50 {
    public static void main(String[] args) {

        // To find the even number from 1 to 10

        for (int i = 0; i <= 50 ; i++) {
            if (i%2 ==0) {
                System.out.println("Even -> " + i);
            } else {
                System.out.println("Odd -> " + i);


            }
            
        }
    }
}

package Ex_10_ForLoop;

public class Lab_106_Q {
    public static void main(String[] args) {
        final boolean b1 = true;

        // Uncommenting this will cause an error because 'b1' is final
        // b1 = false;

        // final boolean is_pramod_married = true;

        // Correctly structured loop
        for (int i = 0; b1; i++) {
            System.out.println("Hello");

            // Break statement to prevent infinite loop
            break;
        }
    }
}





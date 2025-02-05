package ex_09_SwitchLoop;

public class Lab_095_Switch_jdk13_concept {
    public static void main(String[] args) {
        //jdk-13
        // Multiple match is supported you can add multiple conditions

        int itemcode = 000;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }

    }
}

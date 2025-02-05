package ex_08_if_Condition;

public class Lab080_if_Condition_Commandline {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age>18){
            System.out.println("You are allowed to vote");
        }
    }
}


package ex_06_Ternary_Operator;

import com.sun.tools.javac.Main;

public class Lab056_Ternary_p2 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int number = -5;
        String result  = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}

package ex_07_Increment_Decrement_OP;

public class Lab068_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> Expression A -> 10 , a= 11
        // +
        //++a -> B -> Expression B -> 12, a->> 12
        // expA + ExpB -> 10+12 = 22

    }
}

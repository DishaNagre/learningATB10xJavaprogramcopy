package ex_07_Increment_Decrement_OP;

public class Lab069_Exp2 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A-ExpA -> 11 , a=11
      //  +
        // ++a -> B- ExpB-> 1+a= 12 , a=12
        // Exp A + Exp B = 11+12 = 23

    }
}

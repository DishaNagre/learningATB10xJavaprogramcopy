package ex_05_TypeCasting;

public class Lab053_Typecasting {
    public static void main(String[] args) {
        long phone_no = 6543210;
        // short s = phone_no; // implicit ? x
        short s = (short) phone_no;
    }
}

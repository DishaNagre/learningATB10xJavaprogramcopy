package ex_04_Operators;

public class Lab043_Interview {
    public static void main(String[] args) {
        int balaji_salary= 12;
        boolean b = !(balaji_salary >10 || balaji_salary <5);
        System.out.println(b);

        // balaji_salary > 10 -> 12 > 10 _> true
        // balaji_salary < 5 12 < -> false
        // (ture || false) -> !true - false

    }
}

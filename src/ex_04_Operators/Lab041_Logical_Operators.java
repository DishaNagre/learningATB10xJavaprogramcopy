package ex_04_Operators;

import com.sun.tools.javac.Main;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
 boolean a = true;
 boolean b = false;
 boolean c = a && b;
 boolean d = a || b;
 boolean e = !a;
 boolean f = true || false;
 System.out.println(!a);
 System.out.println(!!b);
 System.out.println(f);

 // == comapre the value
        System.out.println(10 == 10);
        System.out.println( 10 < 10);
        System.out.println(!(10>20));

         }
}

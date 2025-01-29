package Task_19th_Jan;

public class Proggram03_IDDC_OP {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(-a + a++ + a--);
        System.out.println(a);
    }
}

        // Initial Value:
        //
        //a = 20
        //--a (pre-decrement):
        //
        //The -- before a decrements a first, then uses the updated value.
        //a = 20 → --a decrements a to 19, and 19 is used in the expression.
        //After --a, a = 19.
        //a++ (post-increment):

        //The ++ after a uses the current value of a first, and then increments a.
        //a = 19 → a++ uses 19, then increments a to 20.
        //After a++, a = 20.
        //a-- (post-decrement):

        //The -- after a uses the current value of a first, and then decrements a.
        //a = 20 → a-- uses 20, then decrements a to 19.
        //After a--, a = 19.



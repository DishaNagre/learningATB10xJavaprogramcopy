package ex_03_java_literals;

public class Lab034_Literal_Char {
    public static void main(String[] args) {
        // how we can store the char literals
        // store in single quote

        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';
        char c4 = '_';
        char c5 = '@';
        char c6 = '1';

        //Escape char
        char tab_line = '\t';
        char new_line = '\n';
        char back_space = '\b';
        char c10 = '\f';
        char c11 = '\'';
        char c12 = '\"';
        char c13 = '\\';
        char carriage_return = '\r';
        System.out.println("Disha" + tab_line + "Nagre");
        System.out.println("Disha" + "Nagre");

// char is basically devided into
// ASCI - limited numbers like A= 65
// UNICODE - india, jap, chia - ex. Rupees Sign

        char rupees = '₹';
        char dollar = '$';
        System.out.println("Disha has 10"+rupees);

    }
}

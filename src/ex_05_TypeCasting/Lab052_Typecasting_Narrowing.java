package ex_05_TypeCasting;

public class Lab052_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
  //      byte b = val; invalid - implicit casting narrowing
        byte b = (byte)val; // Valid explicit casting


    }
}

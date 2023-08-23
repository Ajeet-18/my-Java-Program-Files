
import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);

//        int num = (int)(67.25f);
//        System.out.println(num);

//        automatic type promotion in expression
//        byte b = 50;
//        int number = 'A';
//        System.out.println("Ajeet");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) + (d-s);
        System.out.println((f * b) + " " + (i/c) +  "  " + (d-s));
        System.out.println(result);




    }
}

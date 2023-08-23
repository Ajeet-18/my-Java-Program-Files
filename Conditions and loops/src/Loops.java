import java.util.Scanner;

//import java.util.Scanner;
public class Loops {
    public static  void main(String[] args) {
        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
         */
//        Q. print numbers from 1 to 5
//        for (int num = 1; num <= 10; num += 1) {
//            System.out.println(num);
            // print numbers from 1 to n
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int num = 1; num <= n; num++) {
                System.out.print(num + " ");

            }


    }
}

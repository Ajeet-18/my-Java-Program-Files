// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int salary = 20000;
//        if (salary > 10000) {
//            salary = salary + 2000;
//
//        } else {
//            salary = salary + 1000;
//        }
//
           //multiple if-else
        int salary = 25000;
        if ( salary > 30000 ) {

            salary += 2000;
        } else if (salary > 20000) {

            salary += 3000;
        } else{
            salary += 1000;
        }
        System.out.println(salary);

    }
}
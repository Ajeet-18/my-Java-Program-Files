public class Shadowing {
    static int x = 90; // this will be Shadowing at line 7

    public static void main(String[] args) {
        System.out.println(x);
        int x; // the class variable at line 2 is Shadowing by this
//        System.out.println(x); scope will begin when value is initialised
        x = 40;
        System.out.println(x);
        fun();


    }
    static void fun() {
        System.out.println(x);
    }
}

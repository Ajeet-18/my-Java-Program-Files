public class Overloading {
    public static void main(String[] args) {
        fun(a:67);
        fun(name:"Ajeet");

    }

    static void fun(int a) {
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println(name);

    }
}

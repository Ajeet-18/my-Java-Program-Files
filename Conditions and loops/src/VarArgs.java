import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
        multiple(a:2, b:5, ...v:"Ajeet", "kumar", "Rajak");

    }
    static void multiple(int a, int b, String ...v);

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

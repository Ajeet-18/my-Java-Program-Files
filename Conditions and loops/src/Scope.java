public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Ajeet";

        {
//            a = 100;
//            System.out.println(a);
//            name = "life";
//            System.out.println(name);
        }
        a = 50;
        System.out.println(a);
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

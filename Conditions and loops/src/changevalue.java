import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr = {1,3,4,56,78};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums) {
        nums[2]= 99;
    }
}

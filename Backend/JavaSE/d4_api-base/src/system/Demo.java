package system;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        当前时间戳
        System.out.println(System.currentTimeMillis());

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));

        int[] ints = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(ints));
    }
}

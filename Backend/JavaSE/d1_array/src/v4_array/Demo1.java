package v4_array;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {11,22,33};

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        两个数组变量指向同一个数组对象
        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr1));
        arr1[0] = 11;
        System.out.println(Arrays.toString(arr));
    }
}

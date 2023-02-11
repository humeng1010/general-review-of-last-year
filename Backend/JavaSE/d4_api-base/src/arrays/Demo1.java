package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr = {10,2,5,6,1,7,8};
//        1.输出数组
        System.out.println(Arrays.toString(arr));
//        2.排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        3.二分查找
        System.out.println(Arrays.binarySearch(arr, 10));

//        自定义比较器
        Arrays.sort(arr,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}

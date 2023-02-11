package arrays;

import java.util.Arrays;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 2, 3, 7, 4};
        System.out.println(Arrays.toString(sort(arr)));

        System.out.println(binarySearch(arr, 4));
    }

    /**
     * 选择排序
     * @param arr 待排序的数组
     * @return 排序完成的数组
     */
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
//                    不借助中间变量交换两个变量的值
//                    方法1:加法和减法
                    /*arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];*/
//                    方法2:异或运算
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        return arr;
    }
    /**
     * 二分查找
     *
     * @param arr
     * @param data
     * @return 索引值
     */
    public static int binarySearch(int[] arr, int data) {
        if (Objects.isNull(arr)) return -1;
//        定义左右位置
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
//            取中间索引
            int middleIndex = (left + right) / 2;
//            判断当前中间位置的元素和要找的大小情况
            if (data > arr[middleIndex]) {
//                右查找
                left = middleIndex + 1;

            } else if (data < arr[middleIndex]) {
//                左查找
                right = middleIndex - 1;

            } else {
                return middleIndex;
            }
        }
//        没有这个元素
        return -1;
    }
}

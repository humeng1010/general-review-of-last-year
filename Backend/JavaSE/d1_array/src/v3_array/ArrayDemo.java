package v3_array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        数组求最值
        int[] arr = new int[]{19,10,38,20,11,39};
        System.out.println(ArrayDemo.max(arr));

        System.out.println(new ArrayDemo().min(arr));
    }

    /**
     * 求数组最大值
     * @param arr
     * @return
     */
    public static int max(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    /**
     * 求数组最小值
     * @param arr
     * @return
     */
    public int min(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}

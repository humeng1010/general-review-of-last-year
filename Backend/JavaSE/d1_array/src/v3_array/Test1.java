package v3_array;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{19,10,38,20,11,39};
//        初始:
//        19,10,38,20,11,39
//        第一轮
//        10 19 38 20 11 39
//        10 19 38 20 11 39
//        10 19 20 38 11 39
//        10 19 20 11 38 39
//        10 19 20 11 38 39
//        第二轮
//        10 19 20 11 38 39
//        10 19 20 11 38 39
//        10 19 11 20 38 39
//        10 19 11 20 38 39
//        第三轮
//        10 19 11 20 38 39
//        10 11 19 20 38 39
//        10 11 19 20 38 39
//        第四轮
//        10 11 19 20 38 39
//        10 11 19 20 38 39
//        第五轮
//        10 11 19 20 38 39
//        总共比较了15次 = 1 + 2 + 3 + 4 + 5(arr.length-1)
        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                index++;
                System.out.println("第"+index+"次:"+Arrays.toString(arr));
            }
        }
        System.out.println("result:"+Arrays.toString(arr));
        System.out.println("总共比较了:"+index+"次");
    }
}

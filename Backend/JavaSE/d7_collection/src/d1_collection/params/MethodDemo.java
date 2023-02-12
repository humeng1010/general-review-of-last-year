package d1_collection.params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {

        sum(1);
        sum(10);
        sum(10,20,30);
        sum(1,new int[]{10,20,30});
    }
    public static void sum(int a,int...nums){
        //注意nums在方法内部其实就是数组
        System.out.println("参数个数"+nums.length);
        System.out.println("元素内容"+ Arrays.toString(nums));

    }
}
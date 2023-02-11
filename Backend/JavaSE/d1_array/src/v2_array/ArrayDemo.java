package v2_array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ages = new int[10];
        System.out.println(Arrays.toString(ages));
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }
        System.out.println(Arrays.toString(ages));

//        数组求和
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println(sum);
    }
}

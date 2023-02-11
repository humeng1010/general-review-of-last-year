import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {11,22,33};
//        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println(equalsArr(arr1, arr2));
    }
    public static boolean equalsArr(int[] arr1,int[] arr2){
        if (arr1==arr2) return true;
        if (arr1==null||arr2==null) return false;
        int length = arr1.length;
        if(arr2.length!=length) return false;

//        变量数组
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

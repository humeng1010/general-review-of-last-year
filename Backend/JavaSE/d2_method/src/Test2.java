public class Test2 {
    public static void main(String[] args) {
//        基本类型
        int num = 22;
        changeNum(num);//传递的是num的值：22
        System.out.println(num);
        System.out.println("----------------------------");
//        引用类型
        int[] arr = new int[]{11, 22, 33};
        System.out.println("地址为" + arr);
        change(arr);//传递的是地址值：[I@ [:数组 I:Integer
        System.out.println(arr[1]);//222
        System.out.println("地址为" + arr);

    }

    public static void changeNum(int num) {
        System.out.println(num);
        num = 222;
        System.out.println(num);
    }

    public static void change(int[] arr) {
        System.out.println("地址为" + arr);
        System.out.println(arr[1]);//22
        arr[1] = 222;
        System.out.println(arr[1]);//222
        System.out.println("地址为" + arr);

    }
}

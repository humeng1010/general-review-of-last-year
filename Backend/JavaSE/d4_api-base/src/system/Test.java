package system;

public class Test {
    public static void main(String[] args) {
        //循环开始的时候时间
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        //十万次循环
        for (int i = 0; i < 1e5; i++) {
            System.out.println("输出"+i);
        }
        //循环结束的时候的时间
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        //把毫秒值转换成秒
        System.out.println((endTime - startTime)/1000.0);
    }
}

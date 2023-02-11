package math;

public class Demo1 {

    public static void main(String[] args) {
//        public static int abs(int a)	获取参数绝对值
        System.out.println(Math.abs(-100));
//        public static double ceil(double a)	向上取整
        System.out.println(Math.ceil(4.0001));
//        public static double floor(double a)	向下取整
        System.out.println(Math.floor(4.999));
//        public static int round(float a)	四舍五入
        System.out.println(Math.round(4.5));
//        public static int max(int a, int b)	获取两个int值中较大的值
        System.out.println(Math.max(10, 12));
//        public static double pow(double a,double b)	返回a的b次幂的值
        System.out.println(Math.pow(2, 4));
//        public static double random()	返回值为double的随机值，范围[ 0.0,1.0 )
        System.out.println(Math.random());
    }
}

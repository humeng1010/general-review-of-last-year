package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(0.09+0.01);//0.09999999999999999
        System.out.println(1.0-0.32);//0.6799999999999999
        System.out.println(1.015*100);//101.49999999999999
        System.out.println(1.301/100);//0.013009999999999999
        System.out.println("---------------");
        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);//0.30000000000000004
        System.out.println("----------------");
        //包装浮点型对象成为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
//        BigDecimal c1 = a1.add(b1);
//        BigDecimal c1 = a1.subtract(b1);
//        BigDecimal c1 = a1.multiply(b1);
        BigDecimal c1 = a1.divide(b1);
        System.out.println(c1);//BigDecimal内重写了toString方法

        //BigDecimal只是一个手段，我们最终还是要用double类型去接收结果
        double rs = c1.doubleValue();
        System.out.println(rs);//这个时候就可以传给double类型的参数了

        //注意事项：BigDecimal一定是要精度运算的
        BigDecimal a11 = BigDecimal.valueOf(10);
        BigDecimal b11 = BigDecimal.valueOf(3);
//        BigDecimal c11 = a11.divide(b11);报异常 ArithmeticException
//        System.out.println(c11);
        //   c11 = a11/b11          除数   保留几位小数     一半上升（四舍五入）
        BigDecimal c11 = a11.divide(b11, 2, RoundingMode.HALF_UP);
        System.out.println(c11);
    }
}

package date;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        System.out.println(System.currentTimeMillis());

        Date date1 = new Date();
        System.out.println(date1);
//        1h100s后
        long date2 = date1.getTime()+(60*60+100)*1000;
//        将时间毫秒值恢复成对象
        Date date3 = new Date(date2);
        System.out.println(date3);
    }
}

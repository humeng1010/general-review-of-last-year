package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
//        解析字符串. 把2021年08月06日 11:11:11变为2021-08-06 11:11:11格式
        String dateStr = "2021年08月06日 11:11:11";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date parse = simpleDateFormat.parse(dateStr);
        System.out.println(parse);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat1.format(parse);
        System.out.println(format);
    }
}

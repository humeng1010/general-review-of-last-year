package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);

        String dateStr = "2021年08月06日 11:11:11";
        LocalDateTime parse = LocalDateTime.parse(dateStr,DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
        System.out.println(parse);
//        现在是在2021年08月06日 11:11:11后? true
        System.out.println(now.isAfter(parse));
//        现在+99年
        LocalDateTime localDateTime = now.plusYears(99L);
        System.out.println(localDateTime);
//        现在-10年
        LocalDateTime localDateTime1 = now.minusYears(10);
        System.out.println(localDateTime1);

    }
}

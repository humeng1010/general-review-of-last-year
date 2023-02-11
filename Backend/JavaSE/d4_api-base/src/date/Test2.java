package date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate birthDay = LocalDate.of(2001, 10, 10);
//        日期间隔差,精度为年月日
        Period age = Period.between(birthDay, today);
        System.out.println(age.getYears()+"岁"+age.getMonths()+"月"+age.getDays()+"天");
        LocalDateTime todayTime = LocalDateTime.now();
        LocalDateTime birthTime = LocalDateTime.of(2001, 10, 10, 10, 20, 11);
//        时间隔差,精确度高
        Duration ageX = Duration.between(birthTime, todayTime);
        System.out.println(ageX.toDays()+"天");
        System.out.println(ageX.toHours()+"小时");
        System.out.println(ageX.toMinutes()+"分钟");
        System.out.println(ageX.toSeconds()+"秒");
        System.out.println(ageX.toMillis()+"毫秒");
        System.out.println(ageX.toNanos()+"纳秒");

        System.out.println(Long.MAX_VALUE);

    }
}

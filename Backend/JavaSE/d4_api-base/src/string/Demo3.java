package string;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        1.获取字符串长度
        String s1 = "我爱你";
        System.out.println(s1.length());
//        2.获取某个索引位置出的字符
        String s2 = "abcdefg";
        /*System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(1));
        System.out.println(s2.charAt(2));*/
        for (int i = 0; i < s2.length(); i++) {
            System.out.println(s2.charAt(i));
        }
//        验证字符串常量池的存在(在堆内存中)
        String s3 = "abcdefg";
        System.out.println(s2==s3);
//        3.把字符串转换为字符数组
        String s4 = "123abc";
        char[] chars = s4.toCharArray();
        System.out.println(Arrays.toString(chars));//[1, 2, 3, a, b, c]
//        利用String构造函数还原
        String s = new String(chars);
        System.out.println(s);//123abc
//        4.截取内容
        String s5 = "加油华为~";
        System.out.println(s5.substring(0, 4));

//        从当前位置一直截取到末尾
        System.out.println(s5.substring(2));

//        5.替换关键字
        String s6 = "123def";
        System.out.println(s6.replace("123", "abc"));

//        6.判断字符串中是否包含关键字
        String s7 = "我的我的";
        System.out.println(s7.contains("我的"));

//        7.判断是以什么开始的
        String s8 = "17359003860";
        System.out.println(s8.startsWith("173"));

//        8.以什么分割字符串
        String names = "张三,李四,王五";
        String[] name = names.split(",");
        System.out.println(Arrays.toString(name));


    }
}

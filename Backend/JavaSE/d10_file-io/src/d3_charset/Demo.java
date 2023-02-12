package d3_charset;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String name = "张三red";
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));

        String decode = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(decode);
    }
}

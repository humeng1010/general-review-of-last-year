package d5_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("admin", "root");
        properties.setProperty("password", "123456");
        System.out.println(properties);
        /**
         * 参数一：保存管道
         * 参数二：保存心得注释
         */
        properties.store(new FileWriter("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/application.properties"), "this is user");
    }
}

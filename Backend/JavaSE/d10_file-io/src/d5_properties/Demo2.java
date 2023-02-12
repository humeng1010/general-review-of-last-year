package d5_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(properties);
        properties.load(new FileReader("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/application.properties"));
        System.out.println(properties);
        String admin = properties.getProperty("admin");
        System.out.println(admin);
    }
}

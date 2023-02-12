package d1_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt");
        System.out.println(file.length());

        System.out.println(file.isFile());

        System.out.println(file.isDirectory());

        System.out.println(file.getName());

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));

        File file1 = new File("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/2.txt");
        System.out.println(file1.createNewFile()+"创建文件成功");
        System.out.println(file1.delete()+"删除文件成功");
    }
}

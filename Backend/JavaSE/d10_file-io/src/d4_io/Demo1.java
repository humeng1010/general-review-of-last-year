package d4_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt");

        byte[] buffer = new byte[3];
        int len;
        while ((len=fileInputStream.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len));
        }
//        System.out.println(new String(fileInputStream.readAllBytes()));

    }
}

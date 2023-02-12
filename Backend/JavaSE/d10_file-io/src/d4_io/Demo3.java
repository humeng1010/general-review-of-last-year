package d4_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo3 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/2.txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer,0,len);
            }
            System.out.println("copy success");
            fileOutputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

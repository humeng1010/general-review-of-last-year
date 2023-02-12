package d4_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo4 {
    public static void main(String[] args) {
        try(
                InputStream is = new FileInputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt");
                OutputStream os = new FileOutputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/2.txt")
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package d4_io;

import java.io.*;

public class Demo5 {
    public static void main(String[] args) {
        try (
                InputStream is =  new FileInputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt");
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/3.txt");
                OutputStream bos = new BufferedOutputStream(os)
                ){
//            bos.write(bis.readAllBytes());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("完成了复制");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

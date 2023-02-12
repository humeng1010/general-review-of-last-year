package d4_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/1.txt", true);
        outputStream.write('a');
        outputStream.write(98);
        outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //写数据一定要刷新数据！！

        //写一个字节数组出去
        byte[] buffer = {98,'a',99};
        outputStream.write(buffer);
        outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //写中文
        byte[] buffer2 = "我是中国人".getBytes();
        outputStream.write(buffer2);
        outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //写一个字节数组的一部分
        byte[] buffer3 = {98,'a',99,100};
        outputStream.write(buffer3,0,3);
        outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

//        outputStream.flush();
        outputStream.close();//释放资源，包含了刷新，关闭后流就不能使用了

    }
}

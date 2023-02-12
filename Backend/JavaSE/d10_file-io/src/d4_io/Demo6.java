package d4_io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo6 {
    public static void main(String[] args) throws Exception {
        /*//        创建对象
        Student student = new Student("小张", 20, '男');

//        创建普通字节输出流
        FileOutputStream os = new FileOutputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/object.txt");
//        对象序列化:创建对象字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);
        oos.close();
        os.close();*/

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/humeng/Github/general-review-of-last-year/Backend/JavaSE/d10_file-io/src/resource/object.txt"));
        Object o = objectInputStream.readObject();
//        判断 o 的类型是否是 Student 如果是就把o转为Student对象,并把对象的地址存放到s变量中
        if (o instanceof Student s){
            System.out.println(s);
        }

    }
}

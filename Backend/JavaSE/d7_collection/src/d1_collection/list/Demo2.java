package d1_collection.list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合对泛型的支持
 * 基本类型必须使用其包装类
 * 八种基本类型:byte short char -> int -> long -> flot -> double
 */
public class Demo2 {
    public static void main(String[] args) {
        //集合对泛型的支持,不支持基本数据类型
        Collection<String> list1 = new ArrayList<>();
        list1.add("java");
//        list1.add(1);编译阶段报错

        Collection<Integer> integers = new ArrayList<>();
        integers.add(23);//这个时候23会自动装箱成为Integer对象
        System.out.println(integers);


    }
}

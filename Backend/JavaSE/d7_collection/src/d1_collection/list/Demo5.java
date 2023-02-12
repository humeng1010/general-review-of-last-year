package d1_collection.list;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        //创建一个ArrayList集合对象
        //List：有序、可重复、有索引
        List<String> list = new ArrayList<>();//多态写法，经典
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");

        //插入数据
        list.add(2,"HTML");
        System.out.println(list);//[Java, Java, HTML, MySQL, MySQL]

        //根据索引删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //根据索引取元素
        System.out.println(list.get(2));

        //根据索引修改元素，返回修改前的数据
        System.out.println("被修改的数据"+list.set(0, "JavaSE"));
        System.out.println(list);
    }
}

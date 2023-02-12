package d1_collection.set;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Set集合体系的特点
        Set<String> sets = new HashSet<>();//经典的代码：多态；以后我们如果HashSet不想使用，可以直接修改后面的HashSet，不用修改下面的元素了
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);//[Java, MySQL, HTML, SpringBoot] 无序、不重复、无索引。无序：第一次是无序的，后面是有规律的

        Set<String> linked = new LinkedHashSet<>();//多态；以后我们如果HashSet不想使用，可以直接修改后面的HashSet，不用修改下面的元素了
        linked.add("MySQL");
        linked.add("MySQL");
        linked.add("Java");
        linked.add("Java");
        linked.add("HTML");
        linked.add("HTML");
        linked.add("SpringBoot");
        linked.add("SpringBoot");
        System.out.println(linked);//[MySQL, Java, HTML, SpringBoot]有序、不重复、无索引。无索引：只是没有提供索引的方法，底层还是有索引的

    }
}

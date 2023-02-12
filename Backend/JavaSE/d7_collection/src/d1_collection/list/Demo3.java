package d1_collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo3 {
    public static void main(String[] args) {
    //多态，list调用的都是左边Collection中的方法
    Collection<String> list = new ArrayList<>();
    //1、添加元素
    list.add("Java");
    list.add("MySQL");
    list.add("Spring");
    list.add("Java");
    System.out.println(list);
    //2、清空元素
    //list.clear();清空所以的元素
    //3、判断集合是否为空，是空返回true，反之false
    System.out.println(list.isEmpty());//false
    //4、获取元素大小
    System.out.println(list.size());
    //5、判断集合中是否包含某个元素
    System.out.println(list.contains("Java"));
    System.out.println(list.contains("java"));//false 精确匹配
    //6、删除某个元素，如果有多个重复的元素，会默认删除第一个
    System.out.println(list.remove("java"));//false
    System.out.println(list);
    System.out.println(list.remove("Java"));//true
    System.out.println(list);
    //7、把集合转换为数组 这里转换为Object是因为，以后有一种技术可以强行向String的集合中添加其他的元素，所以转成了Object
    Object[] array = list.toArray();
    System.out.println(Arrays.toString(array));

    System.out.println("-------------拓展-----------");

    Collection<String> list2 = new ArrayList<>();
    list2.add("HTML");
    list2.add("CSS");
    list2.add("JS");
    list2.add("vue");

    list.addAll(list2);//把list2中的元素拷贝到list中
    System.out.println(list);
    }
}

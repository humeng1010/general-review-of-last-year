package arrayList;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        添加数据
        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        System.out.println(list);

//        常用API
//        1.获取某个索引处的元素值
        System.out.println(list.get(0));

//        2.获取集合大小
        System.out.println(list.size());

//        3.遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.forEach(item -> System.out.println(item));
//        4.根据索引删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
//        5.根据内容删除元素
        list.remove("刘备");
        System.out.println(list);
//        6.修改指定位置的元素
        list.set(0,"赤兔");
        System.out.println(list);


    }
}

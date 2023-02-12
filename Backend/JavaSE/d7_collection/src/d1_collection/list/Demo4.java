package d1_collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        //多态，list调用的都是左边Collection中的方法
        Collection<String> list = new ArrayList<>();
        //1、添加元素
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("Spring");
        list.add("Java");
        System.out.println(list);

//        使用iterator迭代器遍历
        Iterator<String> iterator = list.iterator();
        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("Java")){
                iterator.remove();
            }
        }
//        可使用removeIf api简化上方使用迭代器删除操作
        list.removeIf(l->l.equalsIgnoreCase("Java"));
        System.out.println(list);

        System.out.println("===========");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("===========");
        list.forEach(s-> System.out.println(s));

        System.out.println("===========");
        list.forEach(System.out::println);
        System.out.println("===========");

    }
}

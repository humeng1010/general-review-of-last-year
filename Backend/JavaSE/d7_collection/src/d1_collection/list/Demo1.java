package d1_collection.list;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        //List 有序、可重复、有索引
        Collection list = new ArrayList();
        list.add("java");
        list.add(123);
        list.add(true);
        list.add("java");
        list.add(123);
        list.add(true);
        System.out.print("List:");//有序、可重复、有索引 :[java, 123, true, java, 123, true]
        System.out.println(list);//可以直接打印出内容，说明重写了toString方法
        //Object[] array = list.toArray(); toArray方法可以把集合转换成数组
        //System.out.println(Arrays.toString(array));  调用Arrays类的toString方法快速打印出数组

        //Set 无序 不重复 无索引
        Collection hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add(123);
        hashSet.add(true);
        hashSet.add("java");
        hashSet.add(123);
        hashSet.add(true);
        System.out.print("Set:");
        System.out.println(hashSet);// 无序、不重复、无索引：[java, 123, true]

//        有序,不重复,无索引
        Set<Integer> integers = new LinkedHashSet<>();
        integers.add(19);
        integers.add(20);
        integers.add(21);
        integers.add(22);
        System.out.println(integers);

//        队列 先进先出
        Queue<String> queue = new LinkedList<>();
//        入队
        queue.add("第一位");
        queue.add("第二位");
        queue.add("第三位");
        System.out.println(queue);
//        出队
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


//        栈 先进后出,后进先出
        Stack<String> stack = new Stack<>();
        stack.push("main方法");
        stack.push("eat方法");
        System.out.println(stack.pop());//eat方法执行完毕,弹出栈
        System.out.println(stack.pop());//main方法执行完毕,弹出栈

    }
}

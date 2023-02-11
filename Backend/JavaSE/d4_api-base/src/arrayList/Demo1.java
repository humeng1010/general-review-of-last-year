package arrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //1、创建ArrayList对象
        ArrayList list = new ArrayList();
        //2、添加数据
        list.add("JavaSE");
        list.add(1);
        list.add(10.9);
        list.add('c');

        //3、打印输出
        System.out.println(list);//打印出的是内容，说明ArrayList重写了toString方法

        //4、给指定位置添加元素
        list.add(1,"注解，反射，多线程，网络编程");//0 1(add) 2(1) 3(2)...
        System.out.println(list);
    }
}

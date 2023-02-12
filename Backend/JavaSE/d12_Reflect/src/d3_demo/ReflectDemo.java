package d3_demo;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass() == list2.getClass());//true
        /**
         * class java.util.ArrayList
         * class java.util.ArrayList
         * 虽然在编译阶段对ArrayList的泛型进行了约束，但是我们看到运用反射得到在运行阶段的时候list1和list2的类型都是ArrayList的，没有泛型进行约束
         * 所以我们就可以利用反射绕过编译阶段对集合添加其他泛型的数据
         */
        System.out.println("=======================");
        list2.add(33);
//        list2.add("hello");
        Class<? extends ArrayList> list2Class = list2.getClass();
        //先获取ArrayList.class文件中所有的方法
        Method[] declaredMethods = list2Class.getDeclaredMethods();
        //遍历
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //获取add方法
        Method add = list2Class.getDeclaredMethod("add", Object.class);
        //执行add方法，向list2中注入"hello"字符串类型的值
        add.invoke(list2, "hello");
        System.out.println(list2);//[33, hello]
      
        System.out.println("------------------");
        ArrayList list3 = list2;
        list3.add("另一种方式突破泛型");
        list3.add(true);
        System.out.println(list3);

    }
}
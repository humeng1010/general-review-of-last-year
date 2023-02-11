package d2_functionProgram;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
    @Test
    public void test1(){
        IHello hello = new IHello() {
            @Override
            public void sayHello(String name) {
                System.out.println("hello"+name);
            }
        };
        hello.sayHello("张三");

    }

    @Test
    public void test2(){
        IHello hello = name-> System.out.println("hello"+name);
        hello.sayHello("李四");
    }

    @Test
    public void test3(){
        int num1 = 100;
        int num2 = 200;
        // 提前定义好需要返回的指定类型结果，但不运行
        Supplier<Integer> supplier = ()->num1+num2;
        System.out.println(supplier.get());

//        方法二
        System.out.println(getValue(() -> num1 + num2));
        String str = "abcdefg";
        System.out.println(getValue(() -> str.substring(0, 4)));

    }
    // 定义一个方法，返回一个结果，参数使用Supplier，具体返回内容由调用者决定
    public static <T>T getValue(Supplier<T> supplier){
        return supplier.get();
    }

    @Test
    public void test4(){
        modify(10,x-> System.out.println(x+10));
        modify(10,x-> System.out.println(x-10));
    }
    public static <T> void modify(T num, Consumer<T> consumer){
        consumer.accept(num);
    }
    @Test
    public void test5(){
        List<Integer> lists = new ArrayList<>();
//        获取偶数
        Consumer<Integer> consumer = integer -> {
            if (integer%2==0) lists.add(integer);
        };
//        并且不小于4
        consumer = consumer.andThen(integer -> lists.removeIf(integer1 -> integer1<4));

        List<Integer> lists2 = new ArrayList<>();
        Collections.addAll(lists2,2,3,4,5,6);

        lists2.forEach(consumer);
        System.out.println(lists);
    }

    @Test
    public void test6(){
        Predicate<Integer> predicate = x -> x >= 10;
        predicate = predicate.and(y->y<=20);
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(9));
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(21));
    }

    @Test
    public void test7(){
        //示例1：定义一个funciton,实现将String转换为Integer
        Function<String,Integer> function = x->Integer.parseInt(x);
        Integer a = function.apply("100");
        System.out.println(a.getClass());           // 结果：class java.lang.Integer
    }

    @Test
    public void test8(){
        //示例3：使用andThen() 实现一个函数 y=10x + 10;
        Function<Double,Double> computed = x -> 10*x;
        computed = computed.andThen(y->y+10);
        Double result = computed.apply(10.0);
        System.out.println(result);
    }

    @Test
    public void test9(){
        Integer[] arrays = {1,2,3,4,5};
        Object[] filter = filter(arrays, array -> array % 2 == 0);

        System.out.println(Arrays.toString(filter));
    }


    public static Object[] filter(Integer[] arrays,Predicate<Integer> function){
        ArrayList<Integer> integers = new ArrayList<>();

        for (Integer array : arrays) {
            boolean test = function.test(array);
            if (test) integers.add(array);
        }
        Object[] res = integers.toArray();
        return res;
    }


}

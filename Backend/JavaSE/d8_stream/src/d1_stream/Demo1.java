package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        Collections.addAll(name,"刘备","张飞","关羽","张三","张无忌");
        System.out.println(name);
        //从name集合中取出姓张的放到新的集合
//        filter
        List<String> list = name.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length()==3)
                .collect(Collectors.toList());
        System.out.println(list);
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1,2,3,4);
//        map
        List<String> collect = integers.stream().map(m -> "<li>" + m + "</li>").collect(Collectors.toList());
        System.out.println(collect);

//        reduce
        System.out.println(integers
                .stream()
                .reduce(100, (beforeVal,currentVal)->beforeVal+currentVal));

    }
}

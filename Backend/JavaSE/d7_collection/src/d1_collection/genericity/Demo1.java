package d1_collection.genericity;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("jack0");
        strings.add("jack1");
        strings.add("jack2");

        Result<ArrayList<String>> arrayListResult = new Result<>(strings);
        System.out.println(arrayListResult);

        System.out.println(new Result<>().ok(strings));
        System.out.println(new Result<>().fail("获取数据失败"));
    }
}

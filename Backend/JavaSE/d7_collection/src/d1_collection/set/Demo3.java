package d1_collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>();
        strings.add("孙悟空");
        strings.add("猪八戒");
        strings.add("孙悟空");
        strings.add("白骨精");

        System.out.println(strings);


    }
}

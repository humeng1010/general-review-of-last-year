package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(19);
//        integers.add("99");
        integers.set(0,18);
        Collections.addAll(integers,2,3,4,5,6);
        System.out.println(integers);
    }
}

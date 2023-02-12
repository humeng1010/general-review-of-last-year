package d1_collection.set;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        //Set集合去重复的原因是 先判断哈希值，再判断equals。重写hashCode和equals去重复
        Set<Student> students = new HashSet<>();
        students.add(new Student("小胡",18,'男'));
        students.add(new Student("小胡",18,'男'));
        students.add(new Student("小王",18,'男'));
        students.add(new Student("小张",18,'男'));
        System.out.println(students);
    }
}

package d1_collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>((o1, o2) -> o2-o1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        System.out.println(treeSet);
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("张",22,'男'));
        students.add(new Student("张三",23,'男'));
        students.add(new Student("张a",20,'男'));
        students.add(new Student("张b",21,'男'));
        System.out.println(students);


//        如果既有参数比较器 又有类自定义比较规则 ;就近原则
        TreeSet<Student> studentss = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        studentss.add(new Student("张",22,'男'));
        studentss.add(new Student("张三",23,'男'));
        studentss.add(new Student("张a",20,'男'));
        studentss.add(new Student("张b",21,'男'));
        System.out.println(studentss);

    }
}

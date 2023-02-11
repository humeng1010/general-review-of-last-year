package object_s;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("胖虎", 18, '男');
        Student student2 = new Student("胖虎", 18, '男');
        //不重写equals会调用Object里面的equals，默认比较地址是否相同,我们完全可以使用 == 号比较
        System.out.println(student1.equals(student2));//不重写equals就是比较地址，false
        System.out.println(student1 == student2);//false
        //但是我们大多数都是想要比较内容是否相同，所以我们就需要在子类中重写equals
        System.out.println(student1.equals(student2));
    }
}
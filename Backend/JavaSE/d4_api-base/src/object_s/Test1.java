package object_s;

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student("胖虎", 18, '男');
        /*String s = student.toString();
        System.out.println(s);*/
        System.out.println(student.toString());
        //直接输出对象变量，默认可以省略toString
        System.out.println(student);
        //在开发中直接输出对象，默认输出对象的地址，其实是毫无意义的
        //开发中输出对象变量，我们更多希望的是看到对象的内容是什么，而不是对象的地址
        //所以我们就需要在Student类中重写toString让它可以输出内容
        System.out.println(student);
    }
}

package d4_extends;

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(19);
        student.study();

        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(40);
        teacher.teach();

    }
}

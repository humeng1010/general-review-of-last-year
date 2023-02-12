package d1_getClass;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("d1_getClass.Student");
        System.out.println(c);

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Student student = new Student();
        Class<? extends Student> studentClass1 = student.getClass();
        System.out.println(studentClass1);
    }
}

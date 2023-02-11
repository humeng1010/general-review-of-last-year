package object_s;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char gender;

    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //先尝试自己重写equals
    /*@Override
    public boolean equals(Object o){
        //1、判断o是不是学生类型
        if (o instanceof Student){
            //2、判断2个对象的内容是否一样
            //this是主调的对象
            //字符串的比较还是要用equals，字符串本身就重写了equals，比较本身内容
            //o是Object类型，我们需要强转为学生
//            if (this.name.equals(((Student) o).name) && this.age == ((Student) o).age && this.gender == ((Student) o).gender){
//                return true;
//            }else {
//                return false;
//            }
            return this.name.equals(((Student) o).name) && this.age == ((Student) o).age && this.gender == ((Student) o).gender;
        }else {
            //学生只能和学生比较，否则返回false
            return false;
        }
    }*/

    //IDEA自动生成，重写equals也会重写hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//先判断了是不是自己和自己比较
        if (o == null || getClass() != o.getClass()) return false;//如果o是null，就是传进来一个空进来，或，判断类型是否一样
        //如果通过了上面的层层判断，就进行正式的内容比较啦(因为此时的o就是学生类型且不为空)
        //首先把Object类型的o强转为Student类型的student，如果进行一一比较
        //注意，这时候进行字符串比较，调用的是Objects里面的equals，而不是直接调用name字符串里面的equals，可以防止空指针异常（就是怕我们传进去一个空值进去比较）
        Student student = (Student) o;
        return age == student.age && gender == student.gender && Objects.equals(name, student.name);
    }
    //重写equals也会重写hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

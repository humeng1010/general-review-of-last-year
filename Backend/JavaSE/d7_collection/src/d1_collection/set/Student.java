package d1_collection.set;

import java.util.Objects;

/**
 * 实现Comparable接口,让该类变为可比较的类
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    /**
     * 只要两个结果内容一样，返回的就是true
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }

    /**
     * 两个对象的内容一样，重写后的hashCode的哈希值就是一样的
     * @return
     */
    @Override
    public int hashCode() {
//        保证入参一样返回的hashCode就是一样的
        return Objects.hash(name, age, sex);
    }

    @Override
    public int compareTo(Student o) {
//        年龄降序
        return o.getAge() - this.getAge();
    }
}
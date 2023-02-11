package d2;

import java.util.Arrays;

public class User {
//   在线人数
    public static Integer online;
    private String name;
    private Integer age;
    private String[] hobbies;
    private String mail;
//    静态代码块
    static {
        online = 0;
    }
//    构造代码块
    {
        name = "张三";
        age = 19;
    }
//    无参构造器
    public User(){
    }
//    有参构造器
    public User(String name,Integer age,String[] hobbies,String mail){
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.mail = mail;
    }

//    getter和setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
//    重写toString
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", mail='" + mail + '\'' +
                '}';
    }
}

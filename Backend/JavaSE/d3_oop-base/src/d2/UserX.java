package d2;

import java.util.Arrays;

public class UserX {
    private String name;
    private int age;
    private String[] hobbies;
    private String mail;

    public UserX() {
    }

    public UserX(String name, int age, String[] hobbies, String mail) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.mail = mail;
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

    @Override
    public String toString() {
        return "UserX{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", mail='" + mail + '\'' +
                '}';
    }
}

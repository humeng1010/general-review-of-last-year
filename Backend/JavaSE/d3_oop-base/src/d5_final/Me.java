package d5_final;

/**
 * 被final修饰的类不能被继承
 */
public final class Me {
    private String name;
    private Integer age;

    public Me() {
    }

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

}

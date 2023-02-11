package d7_abstract;

public abstract class Animal {
    private String name;
//    抽象方法
    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package d9_polymorphic;

public class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
    public void eat(){
        System.out.println("狗在吃骨头");
    }
}

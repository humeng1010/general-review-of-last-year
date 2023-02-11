package d10_anonymous;

public class Test1 {
    public static void main(String[] args) {
        //普通写法（抽象类不能被创建对象）
        Animal animal = new Tiger();
        animal.run();

        //匿名内部类：
        //匿名内部类是一个没有名字的内部类
        //匿名内部类写出来就会产生一个匿名内部类的对象
        //相当于创建的子类对象，我们认为是什么类就是什么类，可不是动物对象！因为抽象类不能创建对象的
        //我们new出来的相当于Animal的子类！！！子类可以给到父类，这是多态的写法
        Animal animal1 = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的快");
            }
        };
        animal1.run();
    }
}

class Tiger extends Animal{

    @Override
    public void run() {
        System.out.println("老虎跑的快");
    }
}

abstract class Animal{
    public abstract void run();
}

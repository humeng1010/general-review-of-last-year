package d1;

public class Car {
    //    成员变量(属性)
    String name;
    double price;

    //    方法(行为)
    public void start() {
        System.out.println(name + "启动了");
    }

    public void run() {
        System.out.println("价格是" + price + "的" + name + "跑的贼快！");
    }
}

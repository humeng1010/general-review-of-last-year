package d3;

/**
 * 饿汉单例模式
 * 在类获取对象的时候，对象已经提前为你创建好了。
 * 1、定义一个单例类
 */
public class SingleInstance {
    //3、定义一个静态变量，存储一个对象即可：属于类，与类一起加载一次
    public static SingleInstance instance = new SingleInstance();

    //2、单例必须私有构造器
    private SingleInstance(){
        System.out.println("创建了一个对象");
    }

}

package d3;

/**
 * 1、懒汉单例模式
 */
public class SingleInstance2 {

    //3、定义一个静态变量,属于类，与类一起加载一次,(不能初始化对象，因为它懒）
//    public static SingleInstance2 instance;
    //把静态成员变量设为私有，防止别人调用这个啥都没有的静态变量，会坑到人的
    private static SingleInstance2 instance;

    //2、私有构造器
    private SingleInstance2(){
        System.out.println("创建了一个对象");
    }

    //3、定义一个方法，让其他地方可以调用获取一个对象
    public static SingleInstance2 getInstance(){
        //首先判断是不是已经创建了一个对象，如果没有创建（第一次）就创建一个对象给静态变量，后续就有对象了，就不会再次创建对象了，保障多次创建的是同一个对象
        if (instance == null){
            instance = new SingleInstance2();
        }

        return instance;
    }

}
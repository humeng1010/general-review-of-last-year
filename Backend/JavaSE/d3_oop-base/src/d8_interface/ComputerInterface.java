package d8_interface;

public interface ComputerInterface {
    //JDK1.8之前接口中的成员只有 常量 和 抽象方法
//    public static final String COMPUTER_NAME = "MacBook";
    //在接口中定义的默认就是静态常量
    String COMPUTER_NAME = "MacBook";
    //    public abstract 可以省略不写
    void USB();//USB接口
    void HDMI();//高清接口
    void DP();//数字式视频接口
    void type_c();//type-c接口

    static void show(){
        System.out.println("接口中定义静态方法,接口的静态方法必须使用本身接口名来调用");
    }
    default void def(){
        System.out.println("需要 使用接口的 实现类 的对象来调用");
        go();
    }

    private void go(){
        System.out.println("必须在接口内部才能被访问");
    }

}

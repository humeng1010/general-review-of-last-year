package d10_anonymous;

public class Test2 {
    public static void main(String[] args) {

        //匿名内部类：创建一个接口的子类学生对象，
        // 以后用到Lambda表达式就一行代码就ok了
        Swimming s1 = new Swimming() {
            @Override
            public void swimming() {
                System.out.println("学生在游泳");
            }
        };
        go(s1);

        Swimming s2 = new Swimming() {
            @Override
            public void swimming() {
                System.out.println("老师在游泳");
            }
        };
        go(s2);

        //我们还可以直接把匿名内部类直接作为方法的入参传送给方法
        go(new Swimming() {
            @Override
            public void swimming() {
                System.out.println("我在游泳");
            }
        });
        //Lambda表达式就一行代码就ok了,这个以后讲述
        Swimming s3 = () -> System.out.println("Lambda在游泳");
        go(s3);

        go(() -> System.out.println("Lambda在游泳!!"));
    }
    public static void go(Swimming swimming){
        System.out.println("开始...");
        swimming.swimming();
        System.out.println("结束...");
    }
}

/**
 * 定义一个接口：游泳
 */
interface Swimming{
    void swimming();
}
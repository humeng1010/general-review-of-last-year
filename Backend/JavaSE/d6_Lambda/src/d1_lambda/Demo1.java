package d1_lambda;

public class Demo1 {

    public static void main(String[] args) {
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游的很快");
            }
        });

        go(()->{
            System.out.println("老师游泳游得接近了光速！！");
        });
    }


    public static void go(Swimming s){
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}

@FunctionalInterface//一旦加上这个注解，这个接口就必须是函数式接口，里面只能有一个抽象方法。
interface Swimming{
    void swim();
}

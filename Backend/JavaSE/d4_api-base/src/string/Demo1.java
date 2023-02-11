package string;

public class Demo1 {
    public static void main(String[] args) {
        //通过这种方法创建了两个对象，一个是在字符串常量池中的"abc"，还有一个是在堆内存中new出来的s1。其中s1是在堆内存中的
        String s1 = new String("abc");

        //这句代码实际上创建了0个对象！ 因为字符串常量池中已经有"abc"，所以s2并没有在字符串常量池中再创建一个同样的"abc"对象
        String s2 = "abc";

        System.out.println(s1 == s2);//s1是在堆内存中的，s2是在字符串常量池中的，
        System.out.println(s1.equals(s2));// ==号比较的实际上是地址
        // （equals若没有重写，比较的其实也是地址，重写equals是为了让它比较内容是否一样,equals在String里面被重写了，所以s1.equals(s2)为true）
        //因为s1和s2的地址不同，所以是false！
    }
}

package stringBuilder;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();//""
        stringBuilder.append("a");
        System.out.println(stringBuilder);
        stringBuilder.append("b");
        stringBuilder.append(1);
        stringBuilder.append(false);
        stringBuilder.append(3.33);
        stringBuilder.append("abc");
        stringBuilder.append(2.4f);
        System.out.println(stringBuilder);

        //支持链式编程
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("https://").append("www.").append("apple").append(".com");
        System.out.println(stringBuilder1);

        //反转内容
        stringBuilder1.reverse().append("反转");
        System.out.println(stringBuilder1);
        //长度
        //insert插入
        stringBuilder1.insert(0,"22");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.length());

        //注意：StringBuilder只是拼接字符串的手段，效率好
        //最终的目的还是要恢复成String类型。才能复合方法的参数
        String s = stringBuilder1.toString();
        test(s);


    }
    public static void test(String s){
        System.out.println("方法中的");
        System.out.println(s);
    }
}

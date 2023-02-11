/**
 * 方法重载
 */
public class Test4 {
    public static void main(String[] args) {
        info();
        info("张三");
        info("张三","李四");
        info("张三","李四","你好呀~");
    }
    public static void info(){
        System.out.println("发送一个三无信息");
    }
    public static void info(String sender){
        System.out.println(sender+"发送的信息");
    }
    public static void info(String sender,String aim){
        System.out.println(sender+"发送给"+aim+"的信息");
    }
    public static void info(String sender,String aim,String content){
        System.out.println(sender+"发送给"+aim+"的信息,内容是:"+content);
    }
}

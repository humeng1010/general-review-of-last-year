package string;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //正确的用户名和密码
        String OkName = "admin";//常量池
        String OkPassword = "123456";//常量池

        //提示用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("username：");
        String name = scanner.next();//用户输入过来的不是以双引号接收的，是放在堆内存中的
        System.out.println("password：");
        String password = scanner.next();//堆内存

        //判断
        // == 比较的是地址 常量池地址 != 堆内存地址 所以不能使用双等号比较内容是否一样
        if (OkName == name && OkPassword == password){
            System.out.println("success (==)");
        }else {
            System.out.println("username or password is error (==)");
        }

        //equals 精确比较内容是否一致
        if (name.equals(OkName) && password.equals(OkPassword)){
            System.out.println("success (equals)");
        }else {
            System.out.println("username or password is error (equals)");
        }

        //equalsIgnoreCase 忽略大小写比较
        if (name.equalsIgnoreCase(OkName) && password.equalsIgnoreCase(OkPassword)){
            System.out.println("success (equalsIgnoreCase)");
        }else{
            System.out.println("username or password is error (equalsIgnoreCase)");
        }

    }
}

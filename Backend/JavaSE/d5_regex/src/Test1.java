public class Test1 {
    public static void main(String[] args) {
        //校验QQ号，5-10位
        System.out.println(checkQQ("11111111111"));
        System.out.println(checkQQ("11111"));
        System.out.println(checkQQ("1111144"));


        //正则表达式
        System.out.println(checkQQ2("1"));


    }
    public static boolean checkQQ2(String qq){
        return qq !=null && qq.matches("\\d{5,10}");// \d 表示全是数字 { 5 , 10 } 表示5到10位
    }


    public static boolean checkQQ(String qq){
        if (qq == null || qq.length() < 5 || qq.length() > 10) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }

        return true;

    }
}
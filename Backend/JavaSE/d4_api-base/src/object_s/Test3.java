package object_s;

import java.util.Objects;

/**
 * Objects
 */
public class Test3 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
        try {
            System.out.println(s1.equals(s2));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Objects.equals(s1, s2));

        System.out.println(Objects.isNull(s1)?"因为该对象是null,所以调用equals方法出现空指针npe错误":s1);
    }

}

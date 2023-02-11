package arrayList;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(90);
        list.add(70);
        list.add(88);
        list.add(78);
        list.add(79);
        list.add(66);
        list.add(33);
        //删除80分以下的元素
        //[100, 90, 70, 88, 78, 79, 66, 33]
        //[100, 90, 88, 78, 79, 66, 33]
        //[100, 90, 88, 79, 66, 33]
        //[100, 90, 88, 79, 33]   我们发现最后结果还是有80分以下的元素！ 这就是非常经典的bug，
        //                      i
        // 因为要删除时，如果后面的元素元素也是小于80分，这时候删除了本位置的元素，然后下一步就是i++，没有继续判断这个位置是不是小于80，
        // 所以出现了bug。解决方案：
        //一：在判断如果要删除的时候，我们让它删除后i--；也就是让它回到上一个位置，然后再进行循环判断下一个位置是否小于80，不过效率低
        //二：倒序删除！！！
        System.out.println("方法一：");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<80){
                list.remove(i);
                i--;//方法一，效率低
            }
        }
        System.out.println(list);

        //方法二
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(90);
        list2.add(70);
        list2.add(88);
        list2.add(78);
        list2.add(79);
        list2.add(66);
        list2.add(33);
        //[100, 90, 70, 88, 78, 79, 66, 33]
        //[100, 90, 70, 88, 78, 79, 66]
        //[100, 90, 88]
        //  i
        System.out.println("方法二：");
        System.out.println(list2);
        for (int i = list2.size()-1; i>=0; i--){
            if (list2.get(i)<80){
                list2.remove(i);
            }
        }
        System.out.println(list2);
    }
}

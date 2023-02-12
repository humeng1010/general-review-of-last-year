package d1_collection.list;

import java.util.LinkedList;

public class Demo6 {
    public static void main(String[] args) {
//        模拟栈结构
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println("弹夹："+stack);
        //出栈 弹栈
        //System.out.println(stack.getFirst());
        System.out.println("碰~"+stack.pop());
        System.out.println("碰~"+stack.pop());
        System.out.println("碰~"+stack.pop());
        System.out.println("弹夹："+stack);

//        模拟队列结构
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.offerLast("1");//排队是排在最后一个位置；入队的专业英语：offerLast
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        queue.addLast("5");
        System.out.println("当前队伍："+queue);
        //出队
//        System.out.println(queue.getFirst());
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        System.out.println("出队3个后"+queue);

    }
}

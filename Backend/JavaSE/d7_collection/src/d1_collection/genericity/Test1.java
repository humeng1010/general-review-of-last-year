package d1_collection.genericity;

public class Test1 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
//        入队
        stringQueue.push("第1").push("第2").push("第3");
//        出队
        stringQueue.pop().pop();
        System.out.println(stringQueue);
    }
}

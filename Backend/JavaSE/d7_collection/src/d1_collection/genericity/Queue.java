package d1_collection.genericity;

import java.util.LinkedList;

/**
 * 自定义泛型类
 * @param <T>
 */
public class Queue<T> {
    private final LinkedList<T> list = new LinkedList<>();
    public Queue<T> push(T ele){
        list.addLast(ele);
        return this;
    }
    public Queue<T> pop(){
        list.removeFirst();
        return this;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}


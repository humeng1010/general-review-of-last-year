package d3;

public class Test1 {
    public static void main(String[] args) {
        SingleInstance instance1 = SingleInstance.instance;
        SingleInstance instance2 = SingleInstance.instance;
        System.out.println(instance1 == instance2);

        SingleInstance2 instance3 = SingleInstance2.getInstance();
        SingleInstance2 instance4 = SingleInstance2.getInstance();
        System.out.println(instance3 == instance4);

    }
}

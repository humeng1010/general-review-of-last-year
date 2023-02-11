package d5_final;

public class Method {
    public final void show(){
        System.out.println("final修饰的方法不能被子类重写");
    }
}

class Test extends Method{

    /*@Override
    public void show(){
        System.out.println("final修饰的方法不能被子类重写");
    }*/
}
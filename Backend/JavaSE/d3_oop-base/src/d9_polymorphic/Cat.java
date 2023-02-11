package d9_polymorphic;

public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
    //猫独有的方法抓老鼠
    public void catchMice(){
        System.out.println("猫在抓老鼠");
    }
}

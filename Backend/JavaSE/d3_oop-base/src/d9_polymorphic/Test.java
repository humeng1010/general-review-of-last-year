package d9_polymorphic;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Dog();
        Animal animal = new Cat();
        animal.cry();

        test(animal);//我们调用下面的test方法对animal进行类型的判断然后调用独有的方法

    }

    private static void test(Animal animal) {
        //这时候我们不能知道传进来的到底是猫是狗，所以我们需要对Animal进行判断
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMice();
        }
    }
}

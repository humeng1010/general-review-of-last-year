package d1_collection.genericity;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);


        ArrayList<SUV> suvs = new ArrayList<>();
        suvs.add(new SUV());
        suvs.add(new SUV());
        suvs.add(new SUV());
        go(suvs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //go(dogs);//这是赛车游戏，狗不能进来的

    }

    /**
     * 所有车参加比赛,泛型通配符：? 可以
     * @param cars
     */
    public static void go(ArrayList<? extends Car> cars){

    }
}

class Dog{

}

class SUV extends Car{

}

class BMW extends Car{

}

//父类汽车
class Car{

}
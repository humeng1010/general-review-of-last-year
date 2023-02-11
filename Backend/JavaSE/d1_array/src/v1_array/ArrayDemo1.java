package v1_array;


public class ArrayDemo1 {
    public static void main(String[] args) {
        double[] scores = new double[]{99,98,88,89,82};
        System.out.println(scores[0]);
        for (double score : scores) {
            System.out.println(score);
        }

        int[] age = {18,19,20};
        System.out.println(age);

        String[] names = {"张三","李四","王五"};
        System.out.println(names[0]+names[1]+names[2]);


    }
}

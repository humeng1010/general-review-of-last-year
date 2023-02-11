package d6_enum;



public class Test02 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.test(Season.AUTUMN);
    }

    public void test(Season season) {
        switch (season) {
            case SPRING -> System.out.println("万物复苏");
            case SUMMER -> System.out.println("夏日炎炎");
            case AUTUMN -> System.out.println("落霞与孤鹜齐飞，秋水共长天一色");
            case WINTER -> System.out.println("冬天到了，春天的脚步近了");
        }

    }
}
public class Demo {
    public static void main(String[] args) {
        checkAge(-1);
    }
    public static void checkAge(int age) throws NoMoneyException {
        if (age < 0 || age > 200){
            throw new NoMoneyException("KFC Crazy Thursday need 50RMB");
        }else {
            System.out.println("年龄合法");
        }
    }
}

package d4_extends;

public class Teacher extends People{
    public Teacher() {
        //子类中的构造器会默认先访问父类中的无参构造器，然后再执行自己
        //子类构造器的第一行语句默认都是：super()，不写也存在。
        super();
        System.out.println("teacher子类构造器调用");
    }

    public void teach(){
        System.out.println(this.getName()+this.getAge()+"正在教书");
    }
}

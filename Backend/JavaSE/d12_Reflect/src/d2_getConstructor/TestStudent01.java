package d2_getConstructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestStudent01 {
    /**
     * 1、getConstructors：
     * 获取全部的构造器，只能获取public修饰的构造器
     * Constructor[] getConstructors()
     */
    @Test
    public void getConstructors(){
        Class<Student> studentClass = Student.class;
        Constructor<?>[] constructors = studentClass.getConstructors();
        //遍历构造器
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    /**
     * Constructor< ? >[] getDeclaredConstructors()
     * 返回所有构造器对象的数组，存在就能拿到
     */
    @Test
    public void getDeclaredConstructors() {
        Class<Student> c = Student.class;
        //全部
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName() + "===>" + declaredConstructor.getParameterCount());
        }
    }

    /**
     * Constructor< T > getDeclaredConstructor(Class< ? >...parameterTypes)
     * 返回单个构造器对象，存在就能拿到
     */
    @Test
    public void getConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);

//        暴力反射并创建对象
        /*declaredConstructor.setAccessible(true);
        Student student = declaredConstructor.newInstance("a", 10);
        System.out.println(student);*/
    }
}

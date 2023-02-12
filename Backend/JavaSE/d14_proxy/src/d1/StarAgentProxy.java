package d1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    public static Skill getProxy(Star star){
        return (Skill) Proxy.newProxyInstance(star.getClass().getClassLoader(), star.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收首款");
                Object rs = method.invoke(star, args);
                System.out.println("收尾款");
                return rs;
            }
        });
    }
}

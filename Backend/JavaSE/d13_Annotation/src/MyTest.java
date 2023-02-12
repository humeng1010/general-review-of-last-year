import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,})//只可以在方法，成员变量上标注注解
@Retention(RetentionPolicy.RUNTIME)//永远都活着，在运行阶段被标记的注解也不会消失
public @interface MyTest {
}
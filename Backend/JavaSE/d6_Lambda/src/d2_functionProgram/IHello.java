package d2_functionProgram;

/**
 * 函数式接口:有且仅有一个抽象方法的接口,但可以有多个非抽象方法的接口
 */
@FunctionalInterface
public interface IHello {
	void sayHello(String name);
}
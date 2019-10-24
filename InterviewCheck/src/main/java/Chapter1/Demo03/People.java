package Chapter1.Demo03;

/**
 * @author cong
 * @ClassName: People
 * @Descrip:
 * @since 2019/10/18 15:42
 */
public class People {
    public String name;

    public People() {
        System.out.println("People的构造函数");
        method();
    }

    public void method() {
        System.out.println("People的method方法");
    }
}

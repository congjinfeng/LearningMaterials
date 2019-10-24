package Chapter1.Demo02;

/**
 * @author cong
 * @ClassName: Parent
 * @Descrip:
 * @since 2019/10/18 15:13
 */
public class Parent {
    public Parent() {
        System.out.println("------");
        method1();
        method2();
    }

    public void method1() {
        System.out.println("parentMethod1");
    }

    public void method2() {
        System.out.println("parentMethod2");
    }
}

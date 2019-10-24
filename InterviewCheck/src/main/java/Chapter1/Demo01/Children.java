package Chapter1.Demo01;

/**
 * @author cong
 * @ClassName: Children
 * @Descrip:
 * @since 2019/10/17 9:22
 */
public class Children extends Parent {

    public String name = "childrenName";

    public int age = 18;

    public void method1() {
        System.out.println("childrenMethod1");
    }

    public void method1(int i, int j) {
        System.out.println("childrenMethod1" + i + "--" + j);
    }

    public void method2(int i, int j) {
        System.out.println("childrenMethod2" + i + "--" + j);
    }

    public void method3() {
        System.out.println("childrenmethod3");
    }
}

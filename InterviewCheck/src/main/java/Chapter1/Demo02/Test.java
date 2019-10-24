package Chapter1.Demo02;

/**
 * @author cong
 * @ClassName: Test
 * @Descrip:
 * @since 2019/10/18 15:15
 */
public class Test {
    public static void main(String[] args) {
        Parent obj1 = new Children();
        obj1.method1();
        obj1.method2();

        Parent obj2 = new Parent();
        obj2.method1();
        obj2.method2();
    }
}

package Day1.线程常用的方法;

/**
 * @author cong
 * @ClassName: InvokeClass
 * @Descrip:
 * @since 2019/10/23 15:55
 */
public class InvokeClass {
    public static void InvokeThid() {
        System.out.println("公共方法被调用--" + Thread.currentThread().getName());
    }
}

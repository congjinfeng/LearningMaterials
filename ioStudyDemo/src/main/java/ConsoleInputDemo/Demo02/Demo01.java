package ConsoleInputDemo.Demo02;

/**
 * @author cong
 * @ClassName: Demo01
 * @Descrip:输出到控制台
 * @since 2019/9/2 10:46
 */
public class Demo01 {
    public static void main(String[] args) {
        //System.out返回的是printStream对象，printStream对象继承了outputStream,并且实现了方法write(),其实println()方法的底层也是调用了write()方法
        System.out.println("hello");
    }
}

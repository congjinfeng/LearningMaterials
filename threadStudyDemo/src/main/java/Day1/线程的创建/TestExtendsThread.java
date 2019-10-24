package Day1.线程的创建;

import java.util.Date;

/**
 * @author cong
 * @version 1.0
 * @ClassName: Test
 * @Descrip:
 * @since 2019/8/15 18:59
 */
public class TestExtendsThread {
    public static void main(String[] args) {
        CreateThreadByExtendsThread createThreadByExtendsThread = new CreateThreadByExtendsThread();
        createThreadByExtendsThread.start();
        System.out.println("线程运行结束"+new Date().getTime()+"--"+Thread.currentThread().getName());
    }
}

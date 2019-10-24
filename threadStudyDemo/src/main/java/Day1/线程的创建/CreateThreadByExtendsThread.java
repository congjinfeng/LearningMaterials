package Day1.线程的创建;

import java.util.Date;

/**
 * @author cong
 * @version 1.0
 * @ClassName: CreateThreadByExtendsThread
 * @Descrip:
 * @since 2019/8/15 18:53
 */
public class CreateThreadByExtendsThread  extends Thread{
    @Override
    public void run() {
        System.out.println("使用继承Thread类来实现"+new Date().getTime()+"--"+Thread.currentThread().getName());
    }
}

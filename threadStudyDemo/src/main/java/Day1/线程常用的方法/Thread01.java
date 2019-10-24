package Day1.线程常用的方法;

import java.util.Date;

/**
 * @author cong
 * @ClassName: Thread01
 * @Descrip:
 * @since 2019/10/23 13:57
 */
public class Thread01 extends Thread {

    @Override
    public void run() {
        //System.out.println("Thread01运行了---"+Thread.currentThread().getName());//Thread.currentThread().getName() 获取当前线程的名字
        //System.out.println(Thread.currentThread().getId()+"--"+Thread.currentThread().getName()+"--"+Thread.currentThread().getPriority()+"--"+Thread.currentThread().getState());
        for (int i = 0; i < 10; i++) {
            System.out.println("我来了" + i);
        }
    }
}

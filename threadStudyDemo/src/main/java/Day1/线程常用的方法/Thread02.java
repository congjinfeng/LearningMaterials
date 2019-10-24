package Day1.线程常用的方法;

/**
 * @author cong
 * @ClassName: Thread02
 * @Descrip:
 * @since 2019/10/23 13:57
 */
public class Thread02 extends Thread {
    @Override
    public void run() {
        InvokeClass.InvokeThid();
        System.out.println("Thread02运行了---" + Thread.currentThread().getName());//Thread.currentThread().getName() 获取当前线程的名字
    }
}

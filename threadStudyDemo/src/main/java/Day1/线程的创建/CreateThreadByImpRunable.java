package Day1.线程的创建;

import java.util.Date;

/**
 * @author cong
 * @version 1.0
 * @ClassName: CreateThreadByImpRunable
 * @Descrip:
 * @since 2019/8/15 18:54
 */
public class CreateThreadByImpRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("使用实现Runnable接口来实现"+new Date().getTime());
    }
}

package Day1.线程常用的方法;

import java.util.Date;

/**
 * @author cong
 * @ClassName: Test
 * @Descrip:
 * @since 2019/10/23 13:54
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        test5();
    }

    public static void test() {
        Thread01 thread01 = new Thread01();
        thread01.setName("001");


        Thread02 thread02 = new Thread02();
        thread02.setName("002");


        thread01.start();
        thread02.start();
        System.out.println("mainThread" + Thread.currentThread().getName());
    }

    public static void test1() {
        Thread01 thread01 = new Thread01();
        thread01.start();

        thread01.run();
    }

    public static void test2() {
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);
    }

    public static void test3(){
        Thread01 thread01=new Thread01();
        thread01.start();
        System.out.println(Thread.currentThread().getId()+"--"+Thread.currentThread().getName()+"--"+Thread.currentThread().getPriority()+"--"+Thread.currentThread().getState());
    }

    public static void test4() throws InterruptedException {
        Thread01 thread01=new Thread01();
        thread01.start();
        for(int i=0;i<30;i++){
            System.out.println(i);
            if(i==15){
                thread01.join();
            }
        }
    }

    public static void test5() throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println(new Date().getTime());
                System.out.println("000"+Thread.currentThread().getState());
                Thread.sleep(5000);
                System.out.println("111"+Thread.currentThread().getState());

                System.out.println(new Date().getTime());
            }
        }
    }


}

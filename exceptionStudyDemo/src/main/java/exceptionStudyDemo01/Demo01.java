package main.java.exceptionStudyDemo01;

/**
 * @author cong
 * @version 1.0
 * @ClassName: Demo01
 * @Descrip:
 * @since 2019/8/29 13:39
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(getException(0));
    }

    public static String getException(int num) {
        try {
            return "123";
        } catch (Exception e) {
            e.printStackTrace();
            return "catchException";
        } finally {
            System.out.println("哈哈哈哈");
        }
    }

}

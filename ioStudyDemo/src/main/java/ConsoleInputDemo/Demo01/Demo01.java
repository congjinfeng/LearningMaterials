package ConsoleInputDemo.Demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cong
 * @ClassName: Demo01
 * @Descrip:读取控制台的输入的值，每次读取一个字符
 * @since 2019/9/2 10:11
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        char c;
        //Java 的控制台输入由 System.in 完成。
        //为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            //读取下一个字符，有点像next()方法,执行一次往下读取一次
            c = (char) bufferedReader.read();
            if (c == 'e') {
                System.out.println("已经执行了哦");
            }
           System.out.println(c);
        } while (c != 'q');
    }
}

package ConsoleInputDemo.Demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cong
 * @ClassName: Demo02
 * @Descrip:读取控制台的输入的值，每次读取一个字符串
 * @since 2019/9/2 10:39
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str;
        do {
            //读取字符串，每次输多少就读多少
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

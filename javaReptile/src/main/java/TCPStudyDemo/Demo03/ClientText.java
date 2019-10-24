package TCPStudyDemo.Demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author cong
 * @ClassName: ClientText
 * @Descrip:
 * @since 2019/9/1 17:18
 */
public class ClientText {
    public static void main(String[] args) throws IOException {

        //创建一个Socket对象
        Socket socket=new Socket("localhost",10001);
        //获取键盘输入
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        //Socket输出流
        OutputStream outputStream=socket.getOutputStream();
        while((line=bufferedReader.readLine())!=null){

        }

    }
}

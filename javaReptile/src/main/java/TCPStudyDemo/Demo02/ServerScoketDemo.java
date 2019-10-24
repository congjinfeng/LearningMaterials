package TCPStudyDemo.Demo02;

import com.sun.org.glassfish.gmbal.Description;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cong
 * @ClassName: ServerScoketDemo
 * @Descrip:
 * @since 2019/9/1 15:07
 */
public class ServerScoketDemo {
    
   
    public static void main(String[] args) throws IOException {
        System.out.println("开启服务器端");
        //创建一个ServerScoket对象
        ServerSocket ss = new ServerSocket(10001);
        //获取连接的Socket对象
        Socket s = ss.accept();
        //获取IP
        String ip = s.getInetAddress().getHostAddress();
        //通过客户端Socket对象获取输入流
        InputStream in = s.getInputStream();

        byte[] bytes = new byte[1024];

        int len = in.read(bytes);

        String result = new String(bytes, 0, len);

        //给客户端返回数据
        OutputStream outputStream=s.getOutputStream();
        outputStream.write("收到了，大兄弟".getBytes());

        System.out.println(ip + ":" + result);
        //关闭资源
        s.close();
    }


    public String hello(String hello,int world){
        return "hello"+"world";

   }
}

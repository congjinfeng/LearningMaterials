package TCPStudyDemo.Demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author cong
 * @ClassName: ClientSocket
 * @Descrip:
 * @since 2019/9/1 15:06
 */
public class ClientSocket {

    public static void main(String[] args) throws IOException {
        System.out.println("客户端准备发送数据");
        //创建一个Scoket连接
        Socket socket = new Socket("localhost", 10001);
        //获取输出流
        OutputStream out = socket.getOutputStream();
        //输出信息
        out.write("hello,my dear".getBytes());

        //读取服务端返回的数据
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        String result=new String(bytes,0,len);
        System.out.println(result);

        //关闭资源
        socket.close();
    }
}

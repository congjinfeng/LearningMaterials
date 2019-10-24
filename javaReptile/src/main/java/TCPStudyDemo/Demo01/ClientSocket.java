package TCPStudyDemo.Demo01;

import java.io.IOException;
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
        //关闭资源
        socket.close();
    }
}

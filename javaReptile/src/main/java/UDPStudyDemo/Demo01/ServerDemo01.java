package UDPStudyDemo.Demo01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author cong
 * @ClassName: ServerDemo01
 * @Descrip:使用UDP协议写一个服务器端
 * @since 2019/8/31 21:33
 */
public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        //创建Socket
        DatagramSocket ds = new DatagramSocket(10000);
        //创建数据包用来接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接受传过来的参数放入到数据包
        ds.receive(dp);
        //解析数据
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        int port = dp.getPort();
        byte[] text=dp.getData();
        // 因为上面创建的数组过大，如果没有值，会自动填充空格。
        String result=new String(text,0,dp.getLength());
        
        System.out.println("ip:"+ip);
        System.out.println("name:"+name);
        System.out.println("port:"+port);
        System.out.println("result:"+result);
        //关闭
        ds.close();

    }
}

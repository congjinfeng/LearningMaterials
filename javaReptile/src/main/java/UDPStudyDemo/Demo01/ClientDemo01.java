package UDPStudyDemo.Demo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author cong
 * @ClassName: ClientDemo01
 * @Descrip:使用UDP协议写一个客户端
 * @since 2019/8/31 21:33
 */
public class ClientDemo01 {
    public static void main(String[] args) {
        //创建一个UDP的Socket
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(10001);
            //把要传输的数据打包
            String message = "hello,i am  coming";
            System.out.println(message.getBytes().length);
            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName("127.0.0.1"), 10000);
            //发送数据
            ds.send(dp);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭
            ds.close();
        }
    }
}

package UDPStudyDemo.Demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        DatagramSocket ds = new DatagramSocket(10001);

        while ((line = bufferedReader.readLine()) != null) {
            //创建一个UDP的Socket
            DatagramPacket dp = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10000);
            ds.send(dp);
            if ("over".equals(line)) {
                break;
            }
        }


    }
}

package UDPStudyDemo.Demo03;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author cong
 * @ClassName: Test
 * @Descrip:
 * @since 2019/9/1 14:52
 */
public class Test {
    public static void main(String[] args) throws SocketException {
        DatagramSocket sendgramSocket=new DatagramSocket();
        DatagramSocket receivegramSocket=new DatagramSocket(10000);

        new Thread(new SendThread(sendgramSocket)).start();
        new Thread(new ReceiveThread(receivegramSocket)).start();

    }
}

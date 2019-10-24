package UDPStudyDemo.Demo03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author cong
 * @ClassName: ReceiveThread
 * @Descrip:
 * @since 2019/9/1 14:52
 */
public class ReceiveThread implements Runnable {
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {
        this.ds = ds;
    }

    public void run() {
        try {
            while (true) {
                //创建数据包用来接收数据
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                //接受传过来的参数放入到数据包
                ds.receive(dp);
                //解析数据
                String ip = dp.getAddress().getHostAddress();
                String name = dp.getAddress().getHostName();
                int port = dp.getPort();
                byte[] text = dp.getData();
                // 因为上面创建的数组过大，如果没有值，会自动填充空格。
                String result = new String(text, 0, dp.getLength());
                System.out.println("ip:" + ip + "result:" + result);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

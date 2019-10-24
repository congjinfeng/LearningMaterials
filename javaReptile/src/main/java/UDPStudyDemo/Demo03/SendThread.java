package UDPStudyDemo.Demo03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author cong
 * @ClassName: SendThread
 * @Descrip:
 * @since 2019/9/1 14:52
 */
public class SendThread implements Runnable {

    private DatagramSocket ds;

    public SendThread(DatagramSocket ds) {
        this.ds = ds;
    }


    public void run() {
       try {
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           String line = null;

           while ((line = bufferedReader.readLine()) != null) {
               //创建一个UDP的Socket
               DatagramPacket dp = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10000);
               ds.send(dp);
               if ("over".equals(line)) {
                   break;
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

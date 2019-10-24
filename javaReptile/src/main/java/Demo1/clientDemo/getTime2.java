package Demo1.clientDemo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author cong
 * @ClassName: getTime2
 * @Descrip:
 * @since 2019/9/16 20:32
 */
public class getTime2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        try {
            /*将该套接字连接到给定的地址*/
            s.connect(new InetSocketAddress("time-a.nist.gov", 13),1000);
            /*判断当前套接字是否连接*/
            boolean isConnection=s.isConnected();
            System.out.println(isConnection);
            /*判断当前套接字是否关闭*/
            boolean isClose=s.isClosed();
            System.out.println(isClose);
            Scanner in = new Scanner(s.getInputStream(), "UTF-8");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            s.close();
        }

    }
}

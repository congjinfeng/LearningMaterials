package Demo1.clientDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cong
 * @ClassName: getInetAdress
 * @Descrip:
 * @since 2019/9/16 20:38
 */
public class getInetAdress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] inetAddress=InetAddress.getAllByName("www.baidu.com");
       for(InetAddress inetAddress1:inetAddress){
           System.out.println(inetAddress1.getHostAddress());
           System.out.println(inetAddress1.getHostName());
       }
    }
}

package netStudyDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cong
 * @ClassName: Demo01
 * @Descrip:获取本机IP和名称
 * @since 2019/8/31 18:56
 */
public class Demo01 {
    public static void main(String[] args) throws UnknownHostException {

        // 获取本地主机IP对象
        InetAddress ip = InetAddress.getLocalHost();
        // 获取主机IP地址
        System.out.println(ip.getHostAddress());
        // 获取主机名称
        System.out.println(ip.getHostName());

        // 根据主机名称获取其他主机IP对象
        System.out.println("------------------------------");
        InetAddress ips=InetAddress.getByName("从进峰");
        System.out.println(ips.getHostAddress());
        System.out.println(ips.getHostName());

        // 根据IP地址获取其他主机IP对象
        System.out.println("------------------------------");
        InetAddress ipss=InetAddress.getByName("192.168.78.2");
        System.out.println(ipss.getHostAddress());
        System.out.println(ipss.getHostName());

        // 获取百度的地址和名称
        System.out.println("------------------------------");
        InetAddress baidu=InetAddress.getByName("www.baidu.com");
        System.out.println(baidu.getHostAddress());
        System.out.println(baidu.getHostName());

        // 获取菜鸟教程的地址和名称
        System.out.println("------------------------------");
        InetAddress cainiao=InetAddress.getByName("www.runoob.com");
        System.out.println(cainiao.getHostAddress());
        System.out.println(cainiao.getHostName());
    }
}

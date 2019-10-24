package Demo1.clientDemo;

import java.io.IOException;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author cong
 * @ClassName: getTime
 * @Descrip:获取国际标准时间
 * @since 2019/9/16 20:14
 */
public class getTime {
    public static void main(String[] args)   {
        Socket s = null;
        try {
            s = new Socket("time-a.nist.gov", 13);
            s.setSoTimeout(10);
            Scanner in = new Scanner(s.getInputStream(), "UTF-8");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("有异常");
            e.printStackTrace();
        }
       
    }
}

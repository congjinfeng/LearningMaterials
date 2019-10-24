package javaSocket.Demo1;


import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * @author cong
 * @ClassName: ClientInstance
 * @Descrip:
 * @since 2019/8/30 14:01
 */
public class ClientInstance  {
    public static void main(String [] args)
    {
        int port = 7000;

        String host = "localhost";

        // 创建一个套接字并将其连接到指定端口号
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(socket.getOutputStream()));

            Scanner sc = new Scanner(System.in);

            boolean flag = false;

            while (!flag) {

                System.out.println("请输入正方形的边长:");
                double length = sc.nextDouble();

                dos.writeDouble(length);
                dos.flush();

                double area = dis.readDouble();

                System.out.println("服务器返回的计算面积为:" + area);

                while (true) {

                    System.out.println("继续计算？(Y/N)");

                    String str = sc.next();

                    if (str.equalsIgnoreCase("N")) {
                        dos.writeInt(0);
                        dos.flush();
                        flag = true;
                        break;
                    } else if (str.equalsIgnoreCase("Y")) {
                        dos.writeInt(1);
                        dos.flush();
                        break;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }
}

package javaSocket.Demo1;

import java.io.*;
import java.net.*;


/**
 * @author cong
 * @ClassName: ServerInstance
 * @Descrip:
 * @since 2019/8/30 14:28
 */
public class ServerInstance {
    public static void main(String[] args){
       try {
           // 端口号
           int port = 7000;
           // 在端口上创建一个服务器套接字
           ServerSocket serverSocket = new ServerSocket(port);
           // 监听来自客户端的连接
           Socket socket = serverSocket.accept();

           DataInputStream dis = new DataInputStream(
                   new BufferedInputStream(socket.getInputStream()));

           DataOutputStream dos = new DataOutputStream(
                   new BufferedOutputStream(socket.getOutputStream()));

           do {

               double length = dis.readDouble();
               System.out.println("服务器端收到的边长数据为：" + length);
               double result = length * length;
               dos.writeDouble(result);
               dos.flush();

           } while (dis.readInt() != 0);
           socket.close();
           serverSocket.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

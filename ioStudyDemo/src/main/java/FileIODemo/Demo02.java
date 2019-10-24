package FileIODemo;

import java.io.*;

/**
 * @author cong
 * @ClassName: Demo02
 * @Descrip:
 * @since 2019/9/2 11:35
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/File/hello.txt");

        OutputStream outputStream=new FileOutputStream(f);

        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);

        outputStreamWriter.append("world");


        outputStreamWriter.close();
        outputStream.close();
    }
}

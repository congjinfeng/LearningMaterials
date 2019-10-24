package FileIODemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author cong
 * @ClassName: Demo01
 * @Descrip:使用输出流往文件里面写内容
 * @since 2019/9/2 10:57
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/File/hello.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(f);
        outputStream.write("呵呵呵".getBytes());
        outputStream.write("哈哈哈哈".getBytes());
    }
}

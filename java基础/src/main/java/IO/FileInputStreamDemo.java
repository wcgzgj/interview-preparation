package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileInputStreamDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午4:01
 * @Version 1.0
 **/
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/faro_z/Documents/测试路径/testDir/haha.txt";
        FileInputStream fis = new FileInputStream(new File(filePath));
        byte[] bytes = new byte[10];

        int len=0;
        StringBuilder sb = new StringBuilder();
        while ((len=fis.read(bytes))!=-1) {
            sb.append(new String(bytes,0,len));
        }
        System.out.println(sb.toString());
    }
}

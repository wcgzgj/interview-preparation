package IO;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileReaderDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午4:52
 * @Version 1.0
 **/
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/faro_z/Documents/测试路径/testDir/古诗.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("文件不存在，创建文件");
        }
        FileReader fr = new FileReader(file);
        char[] chars = new char[10];
        int len=0;
        StringBuilder sb = new StringBuilder();
        while ((len=fr.read(chars))!=-1) {
            sb.append(new String(chars,0,len));
        }
        System.out.println(sb.toString());
    }
}

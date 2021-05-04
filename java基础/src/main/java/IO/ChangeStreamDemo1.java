package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName ChangeStreamDemo1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午5:23
 * @Version 1.0
 **/
public class ChangeStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 我们假装这是  从网络中   传来的字节数据
         * 但是我们相对其向字符一样进行操作
         */
        FileInputStream fis = new FileInputStream("/Users/faro_z/Documents/测试路径/testDir/古诗2.txt");
        /**
         * 我们通过转换流，将其转换为
         */
        InputStreamReader isr = new InputStreamReader(fis);
        char[] chars = new char[10];
        int len=0;
        StringBuilder sb = new StringBuilder();
        while ((len=isr.read(chars))!=-1) {
            sb.append(new String(chars,0,len));
        }
        System.out.println(sb.toString());
    }
}

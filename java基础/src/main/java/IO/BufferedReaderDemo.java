package IO;

import java.io.*;

/**
 * @ClassName BufferedReaderDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午5:45
 * @Version 1.0
 **/
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/faro_z/Documents/测试路径/testDir/古诗2.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        /**
         * BufferedReader不能直接转换字节流
         * 要通过转换流转换一下
         */
        BufferedReader br = new BufferedReader(isr);

        String line;
        /**
         * 只有在读到文件末尾，才会返回 null
         * 如果文件中间有部分是空的，是不会返回 null 的
         */
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }


    }
}

package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @ClassName PrintWriterDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午5:39
 * @Version 1.0
 **/
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("/Users/faro_z/Documents/测试路径/testDir/古诗2.txt",true);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("早发白帝城");
        pw.println("朝辞白帝彩云间");
        pw.println("千里江陵一日还");

        //别忘了关闭流，不然，如果还没有 flush，那就不会写入外存
        pw.close();
    }
}

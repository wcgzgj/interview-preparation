package IO;

import javax.sound.midi.Track;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileWriterDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午4:56
 * @Version 1.0
 **/
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/faro_z/Documents/测试路径/testDir/古诗.txt";
        File file = new File(filePath);

        //使用的是追加方式
        FileWriter fw = new FileWriter(file, true);

        fw.append("\n床前明月光")
                .append("\n疑是地上霜")
                .append("\n举头望明月")
                .append("\n低头思故乡");

        fw.close();
    }
}

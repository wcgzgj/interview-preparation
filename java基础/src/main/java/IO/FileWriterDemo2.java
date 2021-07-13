package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileWriterDemo2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午5:07
 * @Version 1.0
 **/
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/faro_z/Documents/测试路径/testDir/古诗2.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("文件不存在，创建文件");
            file.createNewFile();
        }


        FileWriter fw = new FileWriter(file, true);

        fw.append("\n床前明月光")
                .append("\n疑是地上霜")
                .append("\n举头望明月")
                .append("\n低头思故乡");

        //我们不 close
        fw.close();

    }
}

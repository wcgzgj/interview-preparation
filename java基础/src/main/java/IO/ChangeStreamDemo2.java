package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName ChangeStreamDemo1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午5:23
 * @Version 1.0
 **/
public class ChangeStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/faro_z/Documents/测试路径/testDir/古诗2.txt",true);
        /**
         * 我们通过转换流，将其转换为
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.append("hahaha")
                .append("hehehe")
                .append("hihihi");

        osw.flush();
        osw.close();

    }
}

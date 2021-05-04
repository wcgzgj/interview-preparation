package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName PropertiesTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午6:14
 * @Version 1.0
 **/
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties ppt = new Properties();

        //使用字符输入流，写入
        FileReader fr = new FileReader("/Users/faro_z/Documents/测试路径/testDir/books.properties");
        ppt.load(fr);
        String name = ppt.getProperty("name");
        String desc = ppt.getProperty("desc");
        System.out.println(name);
        System.out.println(desc);
    }
}

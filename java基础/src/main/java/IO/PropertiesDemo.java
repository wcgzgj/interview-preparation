package IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @ClassName PropertiesTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午6:14
 * @Version 1.0
 **/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties ppt = new Properties();
        //在内存中，存入数据
        ppt.put("name","金苹果");
        ppt.put("desc","讲述了苹果种植的辛酸历程");

        //使用字符输出流，写出
        FileWriter fw = new FileWriter("/Users/faro_z/Documents/测试路径/testDir/books.properties");
        //                      这里写的是注解
        ppt.store(fw,"存储的图书");
        fw.close();
    }
}

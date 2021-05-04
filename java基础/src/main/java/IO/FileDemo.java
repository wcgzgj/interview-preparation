package IO;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午1:48
 * @Version 1.0
 **/
public class FileDemo {
    public static void main(String[] args) {

        /**
         * 创建文件夹
         */
        String foldPath = "/Users/faro_z/Documents/测试路径/testDir";
        File fold = new File(foldPath);
        if (!fold.exists() && !fold.isDirectory()) {
            fold.mkdirs();
            System.out.println("文件夹创建成功");
        } else {
            System.out.println("文件夹创建失败");
        }


        /**
         * 根据传来的文件夹，在里面新建文件
         */
        File file = new File(fold,"haha.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件已创建");
        } else {
            System.out.println("文件已存在");
        }

        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.getAbsoluteFile());
        // System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile().getName());

    }
}

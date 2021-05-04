package IO;

import java.io.File;

/**
 * @ClassName FileDemo2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午3:04
 * @Version 1.0
 **/
public class FileDemo2 {
    public static void main(String[] args) {
        String path = "/Users/faro_z/文件/坚果云/文档/MarkDown";
        File file = new File(path);
        printAllFile(file);
    }

    /**
     * 打印某一文件夹下的所有文件
     * 我这里，只打印以.md 结尾的文件
     * @param file
     */
    public static void printAllFile(File file) {
        //递归终止条件
        if (!file.isDirectory()) {
            String name = file.getName();
            //我只想打印以.md 结尾的文件
            if (name.endsWith(".md")) {
                System.out.println(name);
            }
            return;
        }
        File[] files = file.listFiles();
        if (files==null) return;
        if (files.length==0) return;
        for (File file1 : files) {
            printAllFile(file1);
        }
    }
}

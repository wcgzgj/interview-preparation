package IO;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName InputStream
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/15 下午2:23
 * @Version 1.0
 **/
public class InputStream {
    @Test
    public void fileInputOutputStreamTest() throws Exception {
        File f = new File("/Users/faro_z/Desktop/IO测试文件/文件测试.txt");
        File outFile = new File("/Users/faro_z/Desktop/IO测试文件/输出测试.txt");
        if (!f.isFile()) {
            throw new Exception("错误，不是文件");
        }
        FileInputStream fis = new FileInputStream(f);
        byte[] b = new byte[1024];
        String pool = "";
        while (fis.read(b)!=-1) {
            String str = new String(b, "utf-8");
            pool+=str;
        }
        System.out.println(pool);
        pool="\n\n"+pool;
        FileOutputStream fos = new FileOutputStream(outFile,true);
        byte[] bytes = pool.getBytes("utf-8");
        fos.write(bytes);

    }

    @Test
    public void inputStreamTest() {
        //抽象类  不使用
        File f = new File("/Users/faro_z/Desktop/IO测试文件/文件测试.txt");
        File outFile = new File("/Users/faro_z/Desktop/IO测试文件/输出测试.txt");
        // new java.io.InputStream()
    }

    @Test
    public void BufferedInputStreamTest() throws IOException {
        File f = new File("/Users/faro_z/Desktop/IO测试文件/文件测试.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        byte[] b = new byte[1024];
        String pool = "";
        while (bis.read(b)!=-1) {
            String str = new String(b, "utf-8");
            pool+=str;
        }
        System.out.println(pool);
    }
}

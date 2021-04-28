package 面向对象进阶.clothes;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClothTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午3:54
 * @Version 1.0
 **/
public class ClothTest {
    public static void main(String[] args) {
        Cloth cloth1 = new Cloth();
        Cloth cloth2 = new Cloth("阿迪达斯");
        Cloth cloth3 = new Cloth("耐克");
        Cloth cloth4 = new Cloth("李宁");

        List<Cloth> list = new ArrayList<>();
        list.add(cloth1);
        list.add(cloth2);
        list.add(cloth3);
        list.add(cloth4);

        for (Cloth cloth : list) {
            System.out.println(cloth.toString());
        }
    }
}

package 数据结构训练;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName GetFirstName
 * @Description 找到 Name 在 List 中的第一个索引
 * @Author FARO_Z
 * @Date 2021/5/3 下午6:20
 * @Version 1.0
 **/
public class GetFirstName {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("FARO_Z");
        list.add("FARO_Z");
        list.add("JOJO");
        list.add("DIO");
        list.add("Kin");
        list.add("JOJO");

        System.out.println("FARO_Z 在 list 中的位置是:"+listTest(list,"FARO_Z"));
        System.out.println("DIO 在 list 中的位置是:"+listTest(list,"DIO"));
        System.out.println("hehe 在 list 中的位置是:"+listTest(list,"hehe"));

    }

    /**
     * 返回 name 在 list 中第一次出现的索引
     * 如果没有，返回 -1
     * @param list
     * @param name
     * @return
     */
    public static int listTest(List<String> list, String name) {
        if (list.size()==0) return -1;
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (Objects.equals(list.get(i),name)) return i;
        }
        return -1;
    }
}

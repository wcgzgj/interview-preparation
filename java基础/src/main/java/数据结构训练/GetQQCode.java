package 数据结构训练;

import java.util.*;

/**
 * @ClassName GetQQCode
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/3 下午6:26
 * @Version 1.0
 **/
public class GetQQCode {
    public static void main(String[] args) {
        String[] codes = {"10001","10086","12347806666","45612378901","10001","12347806666"};
        List<String> list = deleteSameElem(codes);
        printByIterator(list);
        printByForEach(list);
    }

    /**
     * 去重，并转换为 List
     * @param codes
     * @return
     */
    public static List<String> deleteSameElem(String[] codes) {
        //使用 set 去重
        Set<String> set = new HashSet<>();
        for (String code : codes) {
            set.add(code);
        }
        List<String> list = new ArrayList<>(set);
        return list;
    }

    /**
     * 通过迭代器遍历
     * @param list
     */
    public static void printByIterator(List<String> list) {
        System.out.println("通过迭代器遍历:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n\n");
    }

    /**
     * 用增强型 for 循环遍历
     * @param list
     */
    public static void printByForEach(List<String> list) {
        System.out.println("用增强型 for 循环遍历");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("\n\n");
    }
}

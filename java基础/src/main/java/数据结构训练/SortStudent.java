package 数据结构训练;

import 数据结构训练.pojo.Student;
import 数据结构训练.pojo.StudentWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName SortStudent
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/3 下午6:39
 * @Version 1.0
 **/
public class SortStudent {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        List<StudentWithComparable> listwc = new ArrayList<>();

        //实验数据都没有成绩一样的，怎么比？我自己再加几个
        Student stu1 = new Student("贾宝玉", 14, 88.5);
        Student stu2 = new Student("林黛玉", 13, 90.5);
        Student stu3 = new Student("史湘云", 13, 85);
        Student stu4 = new Student("薛宝钗", 15, 91);
        Student stu5 = new Student("史玉柱", 17, 91);
        Student stu6 = new Student("鲁智深", 16, 91);



        StudentWithComparable stuwc1 = new StudentWithComparable("贾宝玉", 14, 88.5);
        StudentWithComparable stuwc2 = new StudentWithComparable("林黛玉", 13, 90.5);
        StudentWithComparable stuwc3 = new StudentWithComparable("史湘云", 13, 85);
        StudentWithComparable stuwc4 = new StudentWithComparable("薛宝钗", 15, 91);
        StudentWithComparable stuwc5 = new StudentWithComparable("史玉柱", 17, 91);
        StudentWithComparable stuwc6 = new StudentWithComparable("鲁智深", 16, 91);

        //初始化
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);

        listwc.add(stuwc1);
        listwc.add(stuwc2);
        listwc.add(stuwc3);
        listwc.add(stuwc4);
        listwc.add(stuwc5);
        listwc.add(stuwc6);

        sortByComparable(listwc);
        System.out.println("使用 comparable 排序后为:");
        for (StudentWithComparable student : listwc) {
            System.out.println(student);
        }


        System.out.println("\n\n");


        sortByComparator(list);
        System.out.println("使用 comparator 排序后为:");
        for (Student student : list) {
            System.out.println(student);
        }

    }

    /**
     * 通过Comparable进行排序
     * @param list
     */
    public static void sortByComparable(List<StudentWithComparable> list) {
        Collections.sort(list);
    }

    /**
     * 通过Comparator进行排序
     * @param list
     */
    public static void sortByComparator(List<Student> list) {
        //我这边使用了lambda 表达式，如果要不报错，编译器必须设置 java8 的编译模式
        Collections.sort(list,(o1,o2) -> {
            if (o1.getScore()<o2.getScore()) return 1;
            else if (o1.getScore()==o2.getScore()) {
                return o1.getAge()-o2.getAge();
            } else return -1;
        });
    }
}

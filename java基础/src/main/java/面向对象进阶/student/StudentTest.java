package 面向对象进阶.student;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午3:48
 * @Version 1.0
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student nullStu = new Student();
        Student stu1 = new Student("Dio", 132, "男", "吃面包");
        Student stu2 = new Student("Jojo", 21, "男", "锻炼");
        List<Student> list = new ArrayList<>();
        list.add(nullStu);
        list.add(stu1);
        list.add(stu2);

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}

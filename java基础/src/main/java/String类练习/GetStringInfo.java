package String类练习;

import String类练习.pojo.Student;

import java.util.Objects;

/**
 * @ClassName GetStringInfo
 * @Description 提取字符创中的有用信息
 * @Author FARO_Z
 * @Date 2021/5/2 下午6:04
 * @Version 1.0
 **/
public class GetStringInfo {
    public static void main(String[] args) {
        String s="name=王五 age=18 classNum=1101";
        Student stu = getStudentInstance(s);
        System.out.println(stu.toString());
    }

    /**
     * 根据字符串，获取 student 实例
     * @param json
     * @return
     */
    public static Student getStudentInstance(String json) {
        String[] strArr = json.split(" ");
        Student student = new Student();
        for (String str : strArr) {
            String[] tmp = str.split("=");
            if (Objects.equals("name",tmp[0])) {
                student.setName(tmp[1]);
            }
            if (Objects.equals("age",tmp[0])) {
                student.setAge(Integer.parseInt(tmp[1]));
            }
            if (Objects.equals("classNum",tmp[0])) {
                student.setClassNum(Integer.parseInt(tmp[1]));
            }
        }
        return student;
    }
}

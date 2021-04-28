package 面向对象进阶.student;

/**
 * @ClassName Student
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午3:46
 * @Version 1.0
 **/
public class Student {
    /**
     * 通过类描述开课吧的 Java 学员。
     * 具有属性： 姓名，年龄，性别，爱好，公司（都是：开课吧），
     * 学科（都是：Java 学科）。
     * 思考：请结合 static 修饰属性进行更好的类设计。
     */
    private String name;
    private Integer age;
    private String sex;
    private String hobby;
    private static String business="开课吧";
    private static String subject="Java 学科";

    public Student(String name, Integer age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static String getBusiness() {
        return business;
    }

    public static void setBusiness(String business) {
        Student.business = business;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        Student.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + sex + '\'' +
                ", 爱好='" + hobby + '\'' +
                ", 公司='" + business + '\'' +
                ", 学科='" + subject + '\'' +
                '}';
    }
}

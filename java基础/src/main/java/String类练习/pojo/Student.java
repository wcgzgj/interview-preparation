package String类练习.pojo;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午6:04
 * @Version 1.0
 **/
public class Student {
    private String name;
    private Integer age;
    private Integer classNum;

    public Student(String name, Integer age, Integer classNum) {
        this.name = name;
        this.age = age;
        this.classNum = classNum;
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

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNum=" + classNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(classNum, student.classNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classNum);
    }
}

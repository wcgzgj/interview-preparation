package 数据结构训练.pojo;

import java.util.Objects;

/**
 * @ClassName StudentWithComparable
 * @Description 实现Comparable接口的学生实体
 * @Author FARO_Z
 * @Date 2021/5/3 下午6:36
 * @Version 1.0
 **/
public class StudentWithComparable implements Comparable<StudentWithComparable>{
    private String name;
    private int age;
    private double score;

    public StudentWithComparable(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public StudentWithComparable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithComparable that = (StudentWithComparable) o;
        return age == that.age &&
                Double.compare(that.score, score) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }


    @Override
    public int compareTo(StudentWithComparable o) {
        /**
         * 对下列四位同学的成绩做降
         * 序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
         */
        if (this.score<o.getScore()) return 1;
        //如果成绩一样，按照年龄由小到大
        else if (this.score==o.getScore()) {
            return this.age-o.getAge();
        } else return -1;
    }
}

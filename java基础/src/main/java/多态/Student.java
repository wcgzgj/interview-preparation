package ε€ζ;

/**
 * @ClassName Student
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 δΈε4:32
 * @Version 1.0
 **/
public class Student extends Person{
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

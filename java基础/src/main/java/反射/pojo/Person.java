package 反射.pojo;

/**
 * @ClassName Person
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 下午3:32
 * @Version 1.0
 **/
public class Person {
    private String name;
    private int age;

    //私有构造器
    private Person(String name) {
        this.name=name;
        this.age=88;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

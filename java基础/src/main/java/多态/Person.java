package ε€ζ;

/**
 * @ClassName Person
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 δΈε4:31
 * @Version 1.0
 **/
public class Person {
    private String name;
    private int age;

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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj==this) return true;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (this.name.equals(person.name) && this.age==person.getAge()) return true;
        }
        return false;
    }
}

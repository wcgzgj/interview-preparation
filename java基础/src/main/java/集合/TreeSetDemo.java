package 集合;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/3 下午3:39
 * @Version 1.0
 **/
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 19);
        Person p3 = new Person("麻子", 19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person person : set) {
            System.out.println(person);
        }

    }

}

class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

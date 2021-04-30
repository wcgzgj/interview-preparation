package 常用类;

import java.util.Objects;

/**
 * @ClassName ObjectsDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/30 下午1:17
 * @Version 1.0
 **/
public class ObjectsDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2=null;
        // System.out.println(p2.equals(p1));   <- 会出现异常
        System.out.println(Objects.equals(p2,p1));
    }
}

class Person {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

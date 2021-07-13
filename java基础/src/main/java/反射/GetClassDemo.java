package 反射;

import 多态.Person;

/**
 * @ClassName GetClassDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 下午3:14
 * @Version 1.0
 **/
public class GetClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Person> c1 = (Class<Person>) new Person().getClass();

        Class<Person> c2 = Person.class;

        Class<Person> c3 = (Class<Person>) Class.forName("多态.Person");

        System.out.println(c1==c2);
        System.out.println(c2==c3);
    }
}

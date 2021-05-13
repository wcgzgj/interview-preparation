package 反射;

import 反射.pojo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ClassDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 下午3:34
 * @Version 1.0
 **/
public class ClassDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取 Person 的 Class 对象
         * （因为之前没有装载过 Person，所以还会先将 Person 的字节码装载到内存中）
         */
        Class<Person> pClass = (Class<Person>) Class.forName("反射.pojo.Person");

        //使用getDeclaredConstructor，获取私有构造器
        Constructor<Person> constructor = pClass.getDeclaredConstructor(String.class);
        //要设置忽略权限检查，这样，才可以使用私有构造器
        constructor.setAccessible(true);
        Person person = constructor.newInstance("DIO");
        System.out.println(person);
    }
}

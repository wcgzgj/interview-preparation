package 反射;

import 反射.pojo.Person;

import javax.xml.transform.Source;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/**
 * @ClassName ClassDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 下午3:34
 * @Version 1.0
 **/
public class ClassDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取 Person 的 Class 对象
         * （因为之前没有装载过 Person，所以还会先将 Person 的字节码装载到内存中）
         */
        Class<Person> pClass = (Class<Person>) Class.forName("反射.pojo.Person");

        Constructor<Person> constructor = pClass.getConstructor();
        Person person = constructor.newInstance();

        Method[] methods = pClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
        }
        for (Method method : methods) {
            if (method.getName().equals("setAge")) {
                method.invoke(person,123);
            }
        }

        System.out.println(person);

    }
}

package 反射;

import 反射.pojo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName ClassDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 下午3:34
 * @Version 1.0
 **/
public class ClassDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取 Person 的 Class 对象
         * （因为之前没有装载过 Person，所以还会先将 Person 的字节码装载到内存中）
         */
        Class<Person> pClass = (Class<Person>) Class.forName("反射.pojo.Person");

        //利用反射，创建一个空对象
        Constructor<Person> constructor = pClass.getConstructor();
        Person person = constructor.newInstance();
        System.out.println(person);

        //通过  (方法名，方法参数...) 的方法，获取指定方法
        Method setName = pClass.getMethod("setName", String.class);
        setName.invoke(person,"FARO_Z");
        System.out.println(person);

        //获取私有方法
        Method setAge = pClass.getDeclaredMethod("setAge", int.class);
        //关闭权限检查
        setAge.setAccessible(true);
        //调用
        setAge.invoke(person,21);

        System.out.println(person);


    }
}

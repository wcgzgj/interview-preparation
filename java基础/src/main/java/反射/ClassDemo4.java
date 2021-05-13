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
public class ClassDemo4 {
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
        /**
         * 通过  (执行该方法的对象向，方法参数...)  我们可以对指定对象，执行该方法
         * 下面，我们就是执行 person 对象的 setName 方法，传入的参数是"FARO_Z"
         */
        setName.invoke(person,"FARO_Z");
        System.out.println(person);


    }
}

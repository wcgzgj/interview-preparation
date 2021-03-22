package 泛型;

import org.springframework.beans.BeanUtils;

/**
 * @ClassName CopyUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/22 上午11:02
 * @Version 1.0
 **/
public class CopyUtil {
    public static <T> T copy(Object obj,Class<T> clazz) {
        if (obj==null) {
            return null;
        }
        if (!clazz.isInstance(obj)) {
            return null;
        }
        T t=null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(obj,t);
        return t;
    }
}

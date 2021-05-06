import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import pojo.Person;

/**
 * @ClassName JSONDemo2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午8:35
 * @Version 1.0
 **/
public class JSONDemo2 {
    public static void main(String[] args) {
        Person p = new Person("FARO_Z", "123");
        JSON json = (JSON) JSONObject.toJSON(p);

        System.out.println(json.toJSONString());
        System.out.println(json.toJavaObject(Person.class));

    }
}

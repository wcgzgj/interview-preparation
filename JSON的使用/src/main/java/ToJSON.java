import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import pojo.Person;

/**
 * @ClassName ToJSON
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午8:18
 * @Version 1.0
 **/
public class ToJSON {
    public static void main(String[] args) {
        Person p = new Person("FARO_Z", "123");
        String json = JSONObject.toJSONString(p);
        System.out.println(json);

        //{"name":"FARO_Z","password":"123"}

        Person p2 = JSONObject.parseObject("{\"name\":\"FARO_Z\",\"password\":\"123\"}", Person.class);
        System.out.println(p2);
    }
}

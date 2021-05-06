import com.alibaba.fastjson.JSONArray;
import pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JSONDemo3
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午8:40
 * @Version 1.0
 **/
public class JSONDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        String json = JSONArray.toJSONString(list);
        System.out.println(json);


        List<Integer> res = JSONArray.parseArray(json, Integer.class);
        System.out.println(res);

        Class
    }
}

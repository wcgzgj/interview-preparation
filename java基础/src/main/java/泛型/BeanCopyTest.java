package 泛型;

import domain.Node;
import domain.User;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BeanCopyTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/22 上午10:55
 * @Version 1.0
 **/
public class BeanCopyTest {
    @Test
    public void copyTest() {
        Node node = new Node(12, "FARO_Z");
        User user = new User();
        BeanUtils.copyProperties(node,user);
        System.out.println(user);
    }

    @Test
    public void copyUtilTest() {
        Node node = new Node(12, "FARO_Z");
        Node copy = CopyUtil.copy(node, Node.class);
        System.out.println(copy);
    }

    @Test
    public void arrayListTest() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(null);
        }
        System.out.println(list.size());
    }
}

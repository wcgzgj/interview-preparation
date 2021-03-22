package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Node
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/22 上午10:55
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private int data;
    private String name;

}

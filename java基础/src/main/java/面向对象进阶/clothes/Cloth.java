package 面向对象进阶.clothes;

/**
 * @ClassName Cloth
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午3:53
 * @Version 1.0
 **/
public class Cloth {
    private static int count=0;
    /**
     * 3. 通过类描述衣服， 每个衣服对象创建时需要自动生成一个序号值。 要
     * 求：每个衣服的序号是不同的， 且是依次递增 1 的
     */
    private int id;
    private String name;

    public Cloth(String name) {
        this.name = name;
        this.id=count++;
    }

    public Cloth() {
        this.id=count++;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

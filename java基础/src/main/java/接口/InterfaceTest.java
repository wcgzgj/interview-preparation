package 接口;

/**
 * @ClassName InterfaceTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午10:26
 * @Version 1.0
 **/
public class InterfaceTest {

    private static MathInterface m;

    public static void main(String[] args) {
        //m=new MathImpl();
        System.out.println(m.add(2,3));
    }
}

interface MathInterface {
    int add(int x,int y);
}

class MathImpl implements MathInterface {

    @Override
    public int add(int x, int y) {
        return x+y;
    }
}

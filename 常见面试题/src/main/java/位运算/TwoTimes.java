package 位运算;

/**
 * @ClassName TwoTimes
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午2:24
 * @Version 1.0
 **/
public class TwoTimes {
    public boolean isTwoTimes(int num) {
        return (num&(num-1))==0;
    }
}

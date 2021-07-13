package 数学.最大公约数;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午4:09
 * @Version 1.0
 **/
public class Solution {
    public int getRes(int x,int y) {
        int max = x >= y ? x : y;
        int min= x < y ? x : y;
        if (max%min==0) {
            return min;
        }
        return getRes(min, max%min);
    }
}

package 循环分支;


import java.util.*;

/**
 * @ClassName GetSeason
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:56
 * @Version 1.0
 **/
public class GetSeason {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year<1 || year>12) throw new Exception("错误，月份应该在1-12之间");
        System.out.println(getSeason(year));
    }

    public static String getSeason(int year) {
        Map<Set<Integer>, String> seasons = new HashMap<>();
        HashSet<Integer> winter = new HashSet<Integer>(Arrays.asList(12,1,2));
        HashSet<Integer> spring = new HashSet<Integer>(Arrays.asList(3,4,5));
        HashSet<Integer> summer = new HashSet<Integer>(Arrays.asList(6,7,8));
        HashSet<Integer> fall = new HashSet<Integer>(Arrays.asList(9,10,11));
        seasons.put(winter,"冬天");
        seasons.put(spring,"春天");
        seasons.put(summer,"夏天");
        seasons.put(fall,"秋天");
        String season="";
        Set<Set<Integer>> keySets = seasons.keySet();
        for (Set<Integer> keySet : keySets) {
            if (keySet.contains(year)) {
                season=seasons.get(keySet);
            }
        }
        return season;
    }
}

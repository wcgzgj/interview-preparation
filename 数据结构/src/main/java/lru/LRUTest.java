package lru;

/**
 * @ClassName LRUTest
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/5 1:37 下午
 * @Version 1.0
 **/
public class LRUTest {
    public static void main(String[] args) {

        //LRUCache cache = new LRUCache(3);
        //cache.put(1,1);
        //cache.put(2,2);
        //cache.put(3,3);
        //
        //System.out.println(cache); // 1 -> 2 -> 3 ->
        //
        //cache.get(1);
        //System.out.println(cache); // 2 -> 3 -> 1 ->
        //
        //cache.put(5,5);
        //System.out.println(cache); // 3 -> 1 -> 5 ->
        //
        //cache.put(6,6);
        //System.out.println(cache); // 1 -> 5 -> 6 ->
        //
        //cache.get(5);
        //System.out.println(cache); // 1 -> 6 -> 5 ->
        //
        //// key=6 是存在的，对应的原值是 6,这里会将6修改为11，并提前
        //cache.put(6,11);
        //System.out.println(cache); // 1 -> 5 -> 11 ->


        LRUCache2 cache = new LRUCache2(3);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);

        System.out.println(cache); // 1 -> 2 -> 3 ->

        cache.get(1);
        System.out.println(cache); // 2 -> 3 -> 1 ->

        cache.put(5,5);
        System.out.println(cache); // 3 -> 1 -> 5 ->

        cache.put(6,6);
        System.out.println(cache); // 1 -> 5 -> 6 ->

        cache.get(5);
        System.out.println(cache); // 1 -> 6 -> 5 ->

        // key=6 是存在的，对应的原值是 6,这里会将6修改为11，并提前
        cache.put(6,11);
        System.out.println(cache); // 1 -> 5 -> 11 ->
    }
}

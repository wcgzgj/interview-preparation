package 集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName HashMapDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/3 下午5:20
 * @Version 1.0
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Book, String> map1 = new HashMap<>();
        Map<Book, String> map2 = new HashMap<>();

        Book book1 = new Book("金苹果", "讲述了种植苹果的心酸历程");
        Book book2 = new Book("银苹果", "讲述了种植苹果的心酸历程");

        map1.put(book1,"我的第一本书");
        map1.put(book2,"我的第二本书");

        /**
         * 修改 key 值
         *
         * 这和时候，属性值变成了：  name:铜苹果  desc:讲述了种植苹果的心酸历程
         * 但是，hash 值还是按照   name:金苹果  desc:讲述了种植苹果的心酸历程   算出来的
         */
        book1.setName("铜苹果");

        Book book3 = new Book("金苹果", "讲述了种植苹果的心酸历程");
        Book book4 = new Book("铜苹果", "讲述了种植苹果的心酸历程");
        System.out.println(map1.get(book3));  //equals 对不上
        System.out.println(map1.get(book4));  //hashCode 对不上
    }
}

class Book {
    private String name;
    private String desc;

    public Book(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(desc, book.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc);
    }
}

package IO;

import sun.plugin2.main.client.PrintBandDescriptor;

import java.io.*;

/**
 * @ClassName SerialiazbleDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午6:48
 * @Version 1.0
 **/
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        Book book = new Book("金苹果", "讲述种植苹果的辛酸历程");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
        oos.writeObject(book);

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
        Object o = ois.readObject();
        Book book2=null;
        if (o instanceof Book) {
            book2= (Book) o;
        }
        System.out.println(book2);
    }
}


/**
 * Serializable只是一个标记接口
 * 实现它不用实现任何方法
 */
class Book implements Serializable {
    private transient String name;
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
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


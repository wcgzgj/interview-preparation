package 面向对象进阶.book;

/**
 * @ClassName Book
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午3:39
 * @Version 1.0
 **/
public class Book {
    /**
     * 1、 编写一个类 Book，代表图书:
     * 具有属性： 名称（title）、页数（pageNum），其中页数不能
     * 少于 200 页，否则输出错误信息，并赋予默认值 200。
     * 具有方法: 为各属性设置赋值和取值方法。 detail，用来在控制
     * 台输出每本图书的名称和页数
     * 编写测试类 BookTest 进行测试：为 Book 对象的属性赋予初始
     * 值，并调用 Book 对象的 detail 方法，看看输出是否正确
     */
    private String title;
    private int pageNum = 200;

    public Book(String title, int pageNum) throws Exception {
        if (pageNum<200) throw new Exception("页数错误，页码不应少于200页");
        this.title = title;
        this.pageNum = pageNum;
    }

    public Book() {
    }

    /**
     * 答应书本信息
     */
    public void detail() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}

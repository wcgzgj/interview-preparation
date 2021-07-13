package top.faroz.观察者模式;

import org.junit.Test;

import java.util.Observable;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 上午10:56
 * @Version 1.0
 **/
public class ObserverTest {
    @Test
    public void OBTest() {
        Republication rep = new Republication();

        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();

        //注册观察者
        rep.addObserver(c1);
        rep.addObserver(c2);
        rep.addObserver(c3);

        rep.setInfo("这是出版社第一次出版");
        rep.setNums(10);
        rep.setPrice(12f);
        //发生了更改
        rep.measureChanged();


        c1.display();
        c2.display();
        c3.display();

        //===========================

        rep.setInfo("这是出版社的第二次出版");
        rep.measureChanged();


        c1.display();
        c2.display();
        c3.display();


        //===========================
        rep.removeObserver(c1);

        rep.setInfo("这是出版社的第三次出版");
        rep.measureChanged();

        c1.display();
        c2.display();
        c3.display();




    }

    @Test
    public void OBTest2() {
        Republication2 rep = new Republication2();

        Customer2 c1 = new Customer2();
        Customer2 c2 = new Customer2();
        Customer2 c3 = new Customer2();

        //注册观察者
        rep.addObserver(c1);
        rep.addObserver(c2);
        rep.addObserver(c3);

        rep.setInfo("这是出版社第一次出版");
        rep.setNums(10);
        rep.setPrice(12f);
        //发生了更改
        rep.measureChanged();


        c1.display();
        c2.display();
        c3.display();

        //===========================

        rep.setInfo("这是出版社的第二次出版");
        rep.measureChanged();


        c1.display();
        c2.display();
        c3.display();


        //===========================
        rep.deleteObserver(c2);

        rep.setInfo("这是出版社的第三次出版");
        rep.measureChanged();

        c1.display();
        c2.display();
        c3.display();




    }
}

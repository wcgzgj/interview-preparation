package 泛型;

import javax.print.DocFlavor;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/29 下午4:57
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        //只能放 Fruit 或者 Fruit 的子类
        Plate<? extends Fruit> plate = new Plate<Apple>();
        //只能放 Apple 或者 Apple 的父类
        Plate<? super Apple> plate2 =new Plate<Fruit>();
    }
}


interface Fruit {}
class Apple implements Fruit {}
class Plate <T> {
    T data;
}
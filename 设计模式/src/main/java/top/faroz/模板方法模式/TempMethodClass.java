package top.faroz.模板方法模式;

import javax.swing.*;

/**
 * @ClassName Temp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午11:46
 * @Version 1.0
 **/
public abstract class TempMethodClass {
    final void templateMethod() {
        method1();
        abstractMethod1();
        method2();
        abstractMethod2();
    }

    void method1() {
        //具体实现
    }

    void method2() {
        //具体实现
    }

    abstract void abstractMethod1();

    abstract void abstractMethod2();

    /**
     * 钩子函数，啥都不实现
     * 或者返回一个返回值
     * @return
     */
    boolean hook() {
        return true;
    }

}

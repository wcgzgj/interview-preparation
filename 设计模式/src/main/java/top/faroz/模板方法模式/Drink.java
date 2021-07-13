package top.faroz.模板方法模式;


/**
 * @ClassName Drink
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午11:33
 * @Version 1.0
 **/
public abstract class Drink {
    /**
     * 使用final申明，是因为不希望子类覆写这个方法
     */
    final void prepare() {
        hotWater();
        addMeta();
        pour();
        /**
         * 钩子函数
         * 如果子类什么都不管，就接着执行
         * 如果子类覆写这个方法，那就可能导致结果变化
         */
        if (needExtra()) {
            addExtra();
        }
    }

    /**
     * pour和hotwater方法，因为是所有类通用的
     * 不需要更改，所以可以直接实现
     */
    void pour() {
        System.out.println("正在倒水");
    }

    void hotWater() {
        System.out.println("正在烧水");
    }

    /**
     * 添加原料和添加额外物品
     * 因为对于不同饮料，可能需求不一样
     * 所以这里用抽象类，让子类自己来实现
     */
    abstract void addMeta();

    abstract void addExtra();

    /**
     * 钩子函数
     * @return
     */
    boolean needExtra() {
        return true;
    }
}

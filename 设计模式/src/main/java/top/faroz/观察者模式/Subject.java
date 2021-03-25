package top.faroz.观察者模式;

public interface Subject {
    /**
     * 注册新的观察者
     * @param o
     */
    void addObserver(Observer o);

    /**
     * 注销原有的观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者，数据更新
     */
    void notifyObservers();


}

package top.faroz.建造者模式;

/**
 * @ClassName Person
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/2 上午12:56
 * @Version 1.0
 **/
public class Person {
    private int id;
    private String name;
    private String addr;
    private double money;

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public Person setMoney(double money) {
        this.money = money;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", money=" + money +
                '}';
    }
}

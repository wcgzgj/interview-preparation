package top.faroz.建造者模式;

/**
 * @ClassName BuildPerson
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/2 上午12:57
 * @Version 1.0
 **/
public class BuildPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(12)
                .setName("dio")
                .setAddr("kkkStreet")
                .setMoney(777);
        System.out.println(person);
    }
}

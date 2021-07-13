package top.faroz.建造者模式;

/**
 * @ClassName StringBuilderTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/2 上午12:48
 * @Version 1.0
 **/
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello!")
                .append(new StringBuilder("My name"))
                .append(" is FARO_Z")
                .append("\nI'm ")
                .append(21)
                .append(" years old");
        System.out.println(sb.toString());
    }
}

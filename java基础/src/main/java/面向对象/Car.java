package 面向对象;

/**
 * @ClassName Car
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午2:24
 * @Version 1.0
 **/
public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car() {
    }

    public void show() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
